package lesson18.dto;

import lombok.*;

@Data
//@Getter геттер сеттер но арк можно заменить на @Data
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor  использовать только 1 из двух конструкторов
//@RequiredArgsConstructor
public class Person {

    private String name;
    private int age;
    private Sex sex;
    private double height;

    public  Person(String name){

        this.name = name;
    }

}
