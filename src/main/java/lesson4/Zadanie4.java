public class Zadanie4 {

    public static void main(String[] args) {
        //       calcRoot();
        double a = 4;
        double b = 10;
        double c = 2;
        double disc = (b * b) - (4 * a * c);
        double num = disc;
        double guess = 6;
        double result = 0;
        while (Math.abs(guess - result) != 0) {
            result = (guess + (num / guess)) / 2;
            guess = result;
        }
        System.out.println("Квадратный корень " + result);
        System.out.println(disc);

        if (disc > 0) {
            double x1 = (-b + result )/ (2 * a);
            double x2 = (-b - result )/ (2 * a);
            System.out.println("2 корня " + "x1= " +  x1 + " x2= " + x2);
        } else if (disc < 0) {
            System.out.println("нет корней");
        } else if (disc == 0) {
            double x1 = -b / 2 * a;
            System.out.println("1 корень " + x1);
        }
    }
}