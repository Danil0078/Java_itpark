package lesson10.zadanie10;

import java.util.Objects;

public enum Temperature {
    CELSIUS("c"), KELVIN("K"), FAHRENHEIT("F");

    private final String shorName;

    Temperature(String shorName) {
        this.shorName = shorName;
    }

    public static Temperature of(String input){
        for (Temperature measurementSystem: values()){
 //           if (Objects.equals(measurementSystem.shorName, input))
            if (measurementSystem.shorName.equalsIgnoreCase(input));

            return measurementSystem;
        }

        return CELSIUS;
    }
}
