package lesson8.zadanie8;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Doc doc = new Doc();
        Cow cow = new Cow();

        Animal[] animals= new Animal[]{cat, doc, cow};
        for (Animal animal : animals){
            animal.voice();
        }
    }
}
