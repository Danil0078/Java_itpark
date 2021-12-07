package lesson10;

public class D extends B {

    public D(){
        super(str());
        System.out.println("конструктор D");
    }
    public static String str(){
        return "String";
    }


}
