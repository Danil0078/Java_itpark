package hw22;

import hw22.exception.MandatoryParametrException;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class WeatherRunner {

    private static final String EXIT_PHRASE = "exit";
    private static final String API_WEATHER =
            "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("введите название города");
        while (inputScanner.hasNextLine()){
            String city = inputScanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(city)){
                return;
            }
            String appId = Arrays.stream(args).findFirst().orElseThrow(() ->
                    new MandatoryParametrException("укажите параметр appId для включения апи"));
            URL apiUrl = new URL(String.format(API_WEATHER, city, appId));
            try(Scanner apiScanner = new Scanner(apiUrl.openStream())){
        }
        }
    }
}
