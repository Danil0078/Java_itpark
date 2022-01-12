package lesson11;

public class CarRunner {

    public static void main(String[] args) throws Exception{
        car car = new car();
        car.setDistance(100_000);
        car.setMark("Skoda");
        car.setModel("rapid");
        car.setEngine(new car.Engine(1.46));

        new car.Engine(1.6);
//        new car.Engine(1.6);

        Object carClone = car.clone();
        System.out.println(carClone);
        System.out.println(car);
    }

}
