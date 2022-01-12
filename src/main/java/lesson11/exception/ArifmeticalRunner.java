package lesson11.exception;

import java.util.Scanner;

public class ArifmeticalRunner {

    public static void main(String[] args) {
        System.out.println("введите 2 числа");
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        try {
            System.out.println("Введите 1 число");
            num1 = scanner.nextInt();
        } catch (Exception e){
            num1 = 11;
            scanner.next();
        }
        try {
            System.out.println("Введите 2 число");
            num2 = scanner.nextInt();
        } catch (Exception e){
            num2 = 11;
        }


        int result = divide(num1, num2);
        System.out.println(result);
    }

    public static int divide(int a, int b){
        return  a/b;

    }

}
