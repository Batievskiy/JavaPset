import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Fahrenheit <-> Celsius converter");
        String direction = getDirection();
        int temperature = getTemperature(direction);
        getResult(direction, temperature);
    }

    static String getDirection() {
        Scanner sc = new Scanner(System.in);
        String direction;
        do {
            System.out.print("Convert from (F or C): ");
            direction = sc.nextLine();
        } while (!direction.equals("F") && !direction.equals("C"));
        return direction;
    }

    // let's get temperature from user
    static int getTemperature(String direction){
        int temperature;
        Scanner sc = new Scanner(System.in);
        System.out.print("temperature in " + direction + ": ");
        while (!sc.hasNextInt()) {
            System.out.print("temperature in " + direction + ": ");
            sc.nextLine();
        }
        temperature = sc.nextInt();
        sc.close();
        return temperature;
    }

    // let's convert Fahrenheit to Celsius
    static int fahrenheitToCelsius(int temperatureF) {
        int resultCelsius;
        resultCelsius = (temperatureF - 32) * 5 / 9;
        return resultCelsius;
    }

    // let's convert Celsius to Fahrenheit
    static int celsiusToFahrenheit(int temperatureC) {
        int resultFahrenheit;
        resultFahrenheit = temperatureC * 9 / 5 + 32;
        return resultFahrenheit;
    }

    // let's get result using direction and temperature we got
    static void getResult(String direction, int temperature) {
        int result;
        if (direction.equals("F")) {
            result = fahrenheitToCelsius(temperature);
            System.out.println("converted t: " + result + "C");
        } else {
            result = celsiusToFahrenheit(temperature);
            System.out.println("converted t: " + result + "F");
        }
    }
}
