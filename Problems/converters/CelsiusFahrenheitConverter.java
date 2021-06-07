import java.util.Scanner;

// let's create interactive Celsius / Fahrenheit Converter
// using separate methods for each step
// this version is a bit better designed
public class CelsiusFahrenheitConverter {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // small program introduction
        System.out.println("---< Celsius / Fahrenheit Converter>---");
        String direction = ""; //
        // here we use String.matches() method with a small Regular Expression
        // (?i) - Ignore Letter Case
        // [q] - Only allow the characters q or Q
        while (!direction.matches("(?i)[q]}")) {
            direction = getDirection();
            if (!direction.matches("(?i)[q]")) {
                int temperature = getTemperature(direction);
                printResult(direction, temperature);
            }
            System.out.println();
        }
        sc.close();
    }

    // let's get direction from user input first
    private static String getDirection() {
        String direction = "";

        // keep asking until user input
        while (direction.isEmpty()) {
            System.out.println("Enter temperature scale to convert: ");
            System.out.println(" C) Celsius");
            System.out.println(" F) Fahrenheit");
            System.out.println(" Q) Quit program");
            System.out.print("Your choice: --> ");
            direction = sc.nextLine();
            // check if input is `Quit`
            if (direction.equalsIgnoreCase("q")) {
                System.out.println("\nBye-Bye :)\n");
                System.exit(0);
            }
            // check for proper input using String.matches() method with Regular Expression
            // (?i) - Ignore Letter Case
            // [FC] - Only allow the characters F, f, C, c
            if (!direction.matches("(?i)[FC]")) {
                System.err.println("Invalid Temperature Scale Type (" + direction
                        + ")! Must be F or C!\nTry again...\n");
                direction = "";
            }
        }
        return direction;
    }

    // let's ask user for temperature to convert
    private static int getTemperature(String direction) {
        String temperature;
        // let's use some `Ternary Operators` here
        // make local string for printing
        String directString = (direction.equalsIgnoreCase("f") ? "Fahrenheit" : "Celsius");
        String otherDirectString = (direction.equalsIgnoreCase("f") ? "Celsius" : "Fahrenheit");
        System.out.println();
        System.out.println("Convert a Temperature in " + directString + " to " + otherDirectString + ":");
        do {
            System.out.print("Enter a temperature in " + directString + ": --> ");
            temperature = sc.nextLine().trim(); // trim() - deletes all whitespaces
            // here we can use String.matches() method with small Regular Expression
            // ("\\d+) - Must be a string representation of Integer numerical
            // value with 1 (or possibly) more digits.
            if (!temperature.matches("^-?\\d+$")) {
                System.err.println("Invalid Temperature Supplied (" + temperature + ")!\nTry Again...");
                temperature = "";
            }
        } while (temperature.isEmpty());
        return Integer.parseInt(temperature);
    }

    // let's convert Celsius to Fahrenheit
    static int celsiusToFahrenheit(int temperatureC) {
        return temperatureC * 9 / 5 + 32;
    }

    // let's convert Fahrenheit to Celsius
    static int fahrenheitToCelsius(int temperatureF) {
        return (temperatureF - 32) * 5 / 9;
    }

    // and let's print result using direction and temperature we got
    static void printResult(String direction, int temperature) {
        // let's use `Ternary Operator`
        System.out.println("Converted temperature is : "
                + (direction.equalsIgnoreCase("F")
                ? fahrenheitToCelsius(temperature) + "C"
                : celsiusToFahrenheit(temperature) + "F"));
    }
}
