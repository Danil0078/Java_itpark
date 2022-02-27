package lesson10.zadanie10;

import static lesson10.zadanie10.FahrenheitToCelsius.DELTA;
import static lesson10.zadanie10.FahrenheitToCelsius.KOEFFICIENT;

public class CelsiusToFahenheit {

}
    abstract class CelsiusToFahrenheit implements Convertable {

        @Override
        public double convert(TemperatureValue value) {
            return value.getValue() * KOEFFICIENT + DELTA;
        }
}
