import java.util.Scanner;

public class FahrenheitCelsius {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Fahrenheit / Celsius Converter >---");
        String direction = getDirection();
        int temperature = getTemperature(direction);
        getResult(direction, temperature);
        sc.close();
    }

    // let's get direction of conversion from user input
    static String getDirection() {
        String direction;
        do {
            System.out.print("Convert from F or C: ");
            direction = sc.nextLine();
        } while(!direction.equals("F") && !direction.equals("C"));
        return direction;
    }

    // let's get temperature from user
    static int getTemperature(String direction) {
        int temperature;
        System.out.print("temperature in " + direction + ": ");
        while (!sc.hasNextInt()) {
            System.out.print("temperature in " + direction + ": ");
            sc.nextLine();
        }
        temperature = sc.nextInt();
        return temperature;
    }

    // let's convert Fahrenheit to Celsius
    static int fahrenheitToCelsius(int temperatureF) {
        return (temperatureF - 32) * 5 / 9;
    }

    // let's convert Celsius to Fahrenheit
    static int celsiusToFahrenheit(int temperatureC) {
        return temperatureC * 9 / 5 + 32;
    }

    // let's get result using direction and temperature we got
    static void getResult(String direction, int temperature) {
        int result;
        if (direction.equals("F")) {
            result = fahrenheitToCelsius(temperature);
            System.out.println("result temperature: " + result + "C");
        } else {
            result = celsiusToFahrenheit(temperature);
            System.out.println("result temperature: " + result + "F");
        }
    }
}
