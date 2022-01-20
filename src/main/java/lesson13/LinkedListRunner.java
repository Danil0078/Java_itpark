package lesson13;

import java.util.*;

public class LinkedListRunner {

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        List<String[]> worldsOfWorlds = new LinkedList<>();

        List<Product> products = new LinkedList<>();
        words.add("Skoda");
        words.add("VW");
        words.add("ВАЗ");
        words.add("Bentley");
        ListIterator<String> wordListIterator = words.listIterator();
 //      while (wordListIterator.hasNext()){
 //          String word = wordListIterator.next();
 //       }

 //       while (wordListIterator.hasPrevious()){
 //           String word = wordListIterator.previous();
        System.out.println(words);
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext();){
            String next = iterator.next();
            System.out.println("удаляемый элемент :" + next);
            if (new Random().nextBoolean()){
                iterator.remove();
            }
        }
        System.out.println("осталось :" + words);
        List<String> anotherWorlds = List.of("audi","susuki");
        List<String> yetAnotherListOfWorlds = new ArrayList<>(anotherWorlds);
        words.addAll(anotherWorlds);
        words.addAll(yetAnotherListOfWorlds);
        words.set(5,"jeep");
        System.out.println(words);
        swap(words,1,3);
        System.out.println(words);
    }

    private static void swap(List<String> list, int begin, int finish){
        if (begin >= list.size() || finish >= list.size()){
            return;
        }
       String firstElement = list.get(begin);
       String secondElement = list.get(finish);
       list.set(begin, secondElement);
       list.set(finish,firstElement);

    }
}
