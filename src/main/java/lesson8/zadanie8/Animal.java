package lesson8.zadanie8;

public abstract class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();
}
