package lesson3;


public class Program {
    public static void main(String[] args) {
        long pat = pow(10,4);
        System.out.println(pat);

        double sum = multi(30,5);

        System.out.println(sum);
        byte digital = (byte) 128;
        System.out.println(digital);

        int arg = Integer.MAX_VALUE;
        System.out.println(arg);

        long big  =2147483648L;
        System.out.println(big);

        char symbol = 'Я';//16 бит 0..2^16-1
        System.out.println(symbol +1);

        double digitalSymbol = 3.14;
        float floatSymbol = 100.25F;

        boolean flag = true; //истина
        boolean flag1 = false; //лож
        boolean value = 100 != 1_000; // тысяча
        boolean notValue = !value;
        boolean trueValue = true != false;//так не деелать
        boolean comlexAnd = (100 == 100) & (125 == 125); //true = true & tru
        boolean comlexOr = (100 == 100) | (125 == 125); // true = false | false



        }
    }
    private static long pow(int arg1,int arg2){
            return arg1 % arg2;
    }

    public static double multi (int arg3, int arg4){
        int i = arg3 / arg4;
        return i;

    }


}
