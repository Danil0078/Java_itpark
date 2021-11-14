package lesson3;

public class Zadanie {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 2;
        System.out.println("дискременант равен");
        double discremenant = ((b * b) - (4 * a * c));
        System.out.println(discremenant);
        if (discremenant > 0 ){
            double x1 = (-b + Math.sqrt(discremenant)) / (2 * a);
            System.out.println("первый корень"  + x1 + "второй корень_"  + -x1);

        } else if (discremenant == 0){
            double x2 = (-b / (2 * a));
            System.out.println("1 корень");

        } else if (discremenant <0){
            System.out.println("нет корней");
        }
    }
}