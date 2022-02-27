package lesson10.zadanie10;

public interface Convertable {

    double covert(TemperatureValue value);
    static double convert(TemperatureValue value, Temperature toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new IdentityConverter() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelsius() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToCelsius() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementSystem()) {
                    case KELVIN -> {
                        return new IdentityConverter() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsiusToKelvin() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvin() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new CelsiusToFahrenheit() {
                            @Override
                            public double covert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new IdentityConverter() {
                            @Override
                            public double convert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheit() {
                            @Override
                            public double covert(TemperatureValue value) {
                                return 0;
                            }
                        }.convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("В данный код мы не должны попасть");
    }

    static double convert(double value, Temperature fromSystem, Temperature toSystem) {
        return Convertable.convert(new TemperatureValue(value, fromSystem), toSystem);
    }

    double convert(TemperatureValue value);
}

