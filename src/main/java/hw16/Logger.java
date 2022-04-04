package hw16;

import lombok.RequiredArgsConstructor;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@RequiredArgsConstructor
public class Logger implements Runnable{

    private static final String FORMAT_TEXT = "%s %s %s %s\n";
    private static final DateTimeFormatter FULL_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("dd,MM,yyyy HH:mm;ss");
    private static final int LIFETIME = 2_000;// 60 * 10000

    private final LogLevel level;
    private final String fileName;
    private final long currentTimeMillis = System.currentTimeMillis();
    private int counter = 1;

    @Override
    public void run() {
        System.out.printf("начал работу поток %s\n", Thread.currentThread().getName());
        while (System.currentTimeMillis() <= currentTimeMillis + LIFETIME){ //60млс * 1000 получ 1 м1 мин
            try(FileWriter fw = new FileWriter(fileName, true)){
                fw.write(generateString());
                Thread.sleep(new Random().nextInt(5_000));
            }catch (IOException | InterruptedException exception){
                exception.printStackTrace();
                break;
            }
        }
    }

    private String generateString() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter.ofPattern("dd,MM,yyyy hh:mm;ss");
        return String.format(FORMAT_TEXT, FULL_DATE_TIME_FORMAT.format(now),
                level, Thread.currentThread().getName(), "записали сообщение №" + counter++);
    }

}
