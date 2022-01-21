package lesson13;

import java.util.*;

public class SetRunner {

    public static void main(String[] args) {
        System.out.println(Set.of(13, 15, -1, 28, 75));
        Set<Product> products = new LinkedHashSet<>();
        products.add(new Product(1, "хлеб", 35));
        products.add(new Product(2, "яблоки", 70));
        products.add(new Product(3, "яйца", 60));
        products.add(new Product(4, "мясо", 320));
        System.out.println(products);

        Set<Integer> value = new TreeSet<>();
        value.add(150);
        value.add(15);
        value.add(10);
        value.add(151);
        value.add(1);
        System.out.println(value);

        Set<Product> products2 = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        {
            products2.add(new Product(14, "хлеб", 35));
            products2.add(new Product(2, "яблоки", 70));
            products2.add(new Product(33, "яйца", 60));
            products2.add(new Product(4, "мясо", 320));
            System.out.println(products2);
        }

    }
}
