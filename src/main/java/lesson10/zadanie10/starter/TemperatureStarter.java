package lesson10.zadanie10.starter;

import lesson10.zadanie10.Convertable;
import lesson10.zadanie10.Temperature;


import java.util.Scanner;

public class TemperatureStarter {

    public static void main(String[] args) {
        System.out.println("привет, перевот Т");
        System.out.println("введите температуру:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
           String inputValue =  scanner.next();
           System.out.println("Ожидаем %s ожидаем температуру" + inputValue);
        }
        double value = scanner.nextDouble();
        System.out.println("введите температуру: (введите C, F, K)");
        String temperatureSystem = scanner.next();
        System.out.println(" Введите температуру в которую будем переводить");
        String destinationTemperatureSystem = scanner.next();
        System.out.println(Convertable.convert(value,
                Temperature.of(temperatureSystem),
                Temperature.of(destinationTemperatureSystem)));
    }
}
