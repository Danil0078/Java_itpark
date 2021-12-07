package lesson10;

public class A {

    private String str = "";
    private static String GLOBAL_STR = "пример";
//   {
 //       str =  "test";
//    }
 //       static {
 //           GLOBAL_STR = "";
//}

    public A (){
        this.str = "constructor";
        System.out.println("вызов А");
    }

    protected void print(){

    }
}

