package lesson14;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRunner {

    public static void main(String[] args) {
        Deque<Double> doubles = new ArrayDeque<>();
        doubles.add(15.);
        doubles.add(20.);
        doubles.add(3.14);
        doubles.addFirst(5.);
        System.out.println(doubles.removeLast());

        System.out.println(doubles);
    }
}
