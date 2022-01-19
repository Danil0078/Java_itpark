package lesson12.cornercase;

import lesson12.UnnamedException;

import java.util.Random;

public class InitialingBlock {

    private final String name;


    static {
        if(true/*new Random().nextBoolean()*/) {
            throw new UnnamedException("неизвестный блок");
        }
    }

    public InitialingBlock(String name) /*throws UnnamedException*/ {
        this.name = name;
    }

    public InitialingBlock() /*throws UnnamedException*/ {
 //       throw new UnnamedException("задайте имя обьекту");
        this.name = "Unknown";
    }

    public String getName() {
        return name;
    }
}
