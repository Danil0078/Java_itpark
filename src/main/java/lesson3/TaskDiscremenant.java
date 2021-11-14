package lesson3;

public class TaskDiscremenant {

    public static void main(String[] args) {

        System.out.println("Дискременант равен");
        int a = 10;
        int b = 2;
        int c = 2;
        double dis = (b * b) - (4 * a * c);
        System.out.println(dis);

        if (dis > 0) {
            double x1 = -b + Math.sqrt(dis) / 2 * a;
            System.out.println(x1);
            System.out.println(-x1);

        } else {
            System.out.println("корней нет");
        }
    }
}
