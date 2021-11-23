package lesson6;

import java.util.Arrays;
import java.util.Scanner;


public class Zadanie6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите длину массива");
        Integer size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 2));
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min = array[0];
        System.out.println("первый элемент массива " + min);

        int last = array[array.length - 1];
        System.out.println("последний элемент массива " + last);

        double avg = 0;
        if (array.length > 0){
        }
            double sum = 0;
            for (int j = 0;j < array.length; j++){
                sum += array[j];
            }
            avg = sum / array.length;
        System.out.println("avg " + avg);

    }

}
