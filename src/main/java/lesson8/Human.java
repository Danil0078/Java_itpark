package lesson8;

public class Human {

    private String fio;
    private int age;
    private String nationality;
    private boolean sex;

    private Human(String fio){
        this.fio = fio;
    }



    public Human(String fio, int age, String nationality, boolean sex) {
        this(fio);
        this.age = age;
        this.nationality = nationality;
        this.sex = sex;
    }

    public void changeName(String newName){
        this.fio = newName;
    }

    public void beOlder(){
        this.age++;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        return "Human{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", sex=" + sex +
                '}';
    }
}
