package hw18;

import lombok.SneakyThrows;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileParserRunner {

    private static final String FILE_LOCATION = "/example.txt";


    @SneakyThrows(IOException.class)
    public static void main(String[] args) {
        try ( BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(FileParserRunner.class.getResourceAsStream(FILE_LOCATION),
                        StandardCharsets.UTF_8))){
            String extension = FilenameUtils.
            bufferedReader.lines().forEach(line ->{
                if (StringUtils.isNotBlank(line)){
                    int index = 0;
                    Files.writeString(Paths.get("C:\\test", "result" + index + ))
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
