package lesson2;


public class program {
    public static void main(String[] args) {
        int summa = calculate(1,1);
        System.out.println(summa);
        System.out.println("Вычисление давления");
        int press = formula(100,2);
        System.out.println("Давление равно");
        System.out.println(press);
    }

    public static int calculate (int arg1, int  arg2) {
        return arg1 + arg2;
    }

    public static int formula (int arg3,int arg4) {
        return arg3/arg4;

    }
}
