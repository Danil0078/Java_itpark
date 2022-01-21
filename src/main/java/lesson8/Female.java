package lesson8;

public class Female  extends Human{

    public  Female(String fio, int age, String nationality, boolean b){
        super(fio, age, nationality, false);
    }

    public void cook(){
        System.out.println("kitchen");
    }
}
