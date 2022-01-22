package lesson10.zadanie10;

public class KelvinToCelsius implements Convertable{

    public static final double DELTA = 273.15;


    @Override
    public double covert(TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
