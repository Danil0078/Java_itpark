package lesson10.zadanie10;

import lesson10.zadanie10.Convertable;
import lesson10.zadanie10.TemperatureValue;

public abstract class KelvinToFahrenheit implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvin.DELTA) * FahrenheitToCelsius.KOEFFICIENT
                + FahrenheitToCelsius.DELTA;
    }
}
