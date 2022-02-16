package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) throws  InterruptedException{
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(15);
        System.out.println(numbers.remove());
        for (Integer value: numbers){
            System.out.println(value + "");
        }
        System.out.println(numbers);

        List<String> sharedResources = new ArrayList<>();
        while (true){
            if (!sharedResources.isEmpty()){
            String word = sharedResources.get(0);
            print(word);
        }
            Thread.sleep(1_000);
        }
    }
    public static void print (String str){

        System.out.println(str);
    }
}



