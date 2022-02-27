package lesson10.zadanie10;

import lesson10.zadanie10.Convertable;
import lesson10.zadanie10.TemperatureValue;

public abstract class IdentityConverter implements Convertable {


    @Override
    public double covert(TemperatureValue value) {
        return 0;
    }
}