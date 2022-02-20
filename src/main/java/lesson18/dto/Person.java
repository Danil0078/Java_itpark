package lesson18.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
    private Sex sex;
    private double height;

    public  Person(String name){
        this.name = name;
    }

}
