package lesson10.zadanie10;

import lesson10.zadanie10.Temperature;
import lesson10.zadanie10.TemperatureValue;

public class UniversalConverter {

    public static void convert(double value, Temperature fromSystem, Temperature toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (fromSystem) {
                    case KELVIN -> {
                        return new KelvinToCelsius ().covert(new TemperatureValue(value, fromSystem));
                    }
                }
            }
            case KELVIN -> {
                switch (fromSystem) {
                    case CELSIUS -> {
                        return new CelsiusToKelvin().covert(new TemperatureValue(value, fromSystem));
                    }
                }

            }
        }
        throw new UnsupportedOperationException("не реализовано");
    }
}


