package lesson10.zadanie10;

import lesson10.zadanie10.Convertable;
import lesson10.zadanie10.TemperatureValue;

    public abstract class FahrenheitToCelsius implements Convertable {

        public static final int DELTA = 32;

        public static final double KOEFFICIENT = 1.8; // 9 / 5

        @Override
        public double covert(TemperatureValue value) {
            return (value.getValue() - DELTA) / KOEFFICIENT;
        }


    }

