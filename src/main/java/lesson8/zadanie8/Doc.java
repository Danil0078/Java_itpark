package lesson8.zadanie8;

public class Doc extends Animal {

    private static final String DOG_CATEGORY = "собака";

    public Doc() {
        super(DOG_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + "умеет лаять");
    }
}
