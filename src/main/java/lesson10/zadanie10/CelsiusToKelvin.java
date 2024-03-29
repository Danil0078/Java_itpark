package lesson10.zadanie10;

import lesson10.zadanie10.Convertable;
import lesson10.zadanie10.TemperatureValue;

public abstract class CelsiusToKelvin implements Convertable {

    public static final double DELTA = 273.15;

    @Override
    public double covert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
