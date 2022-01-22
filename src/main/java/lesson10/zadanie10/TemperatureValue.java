package lesson10.zadanie10;

public class TemperatureValue {

    private final double value;
    private final Temperature measurementSystem;

    public TemperatureValue(double value, Temperature measurementSystem) {
        this.value = value;
        this.measurementSystem = measurementSystem;
    }

    public double getValue() {
        return value;
    }

    public Temperature getMeasurementSystem() {
        return measurementSystem;
    }
}
