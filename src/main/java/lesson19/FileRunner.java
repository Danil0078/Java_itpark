package lesson19;

import java.io.File;

public class FileRunner {

    public static void main(String[] args) {
        String fileLocation = "C:\\test\\test.txt";
        File file = new File(fileLocation);
        System.out.println(file.getName()); // имя файла
        System.out.println();
        System.out.println(file.getParent()); //родительская папка файла
        System.out.println(file.getAbsolutePath()); //абсолютный путь
        System.out.println(file.isFile()); // это файл булеан
        System.out.println(file.canRead()); // на чтение
        System.out.println(file.exists()); //существует ли файл тип: булеан
      //  file.mkdir() создание промежуточных файлов
      //  file.mkdirs()
        System.out.println(file.mkdirs()); //создались ли промежуточные значения
    }


}
