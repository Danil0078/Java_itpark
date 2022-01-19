package lesson12.cornercase;

import lesson12.UnnamedException;

public class BlocRunner {

    public static void main(String[] args) throws Exception {
        System.out.println("попытка инициализации блока");
        String name = null;
//        if (name == null) throw new UnnamedException("*");
        InitialingBlock initialingBlock = new InitialingBlock();
        System.out.println(initialingBlock.getName());
    }
}

