package lesson18;

import lesson18.dto.Person;
import lesson18.dto.Sex;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Danil");
        person.setAge(33);
        Person newPerson = new Person();
        new Person("Lanil");
    }
}
