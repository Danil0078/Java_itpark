package lesson8.zadanie8;

public class Cow extends Animal {

    private static final String COW_CATEGORY = "корова";

    public Cow() {
        super(COW_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + "умеет мычать");
    }
}
