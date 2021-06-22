// let's create Decimal <-> Hexadecimal converter

import java.util.Scanner;

public class DecimalHexadecimal {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Decimal <-> Hexadecimal converter >---\n");
        String direction = "";
        while (!direction.matches("(?i)[q]")) {
            direction = getDirection();
            String number;
            if (direction.matches("(?i)[D]")) {
                number = getDecimal();
            } else {
                number = getHexa();
            }
            printResult(direction, number);
        }
    }

    // let's convert Decimal to Hexadecimal
    private static String decimalToHexa(String decimal) {
        int d = Integer.parseInt(decimal);
        return Integer.toHexString(d);
    }

    // lets convert Hexadecimal to Decimal
    private static int hexaToDecimal(String hexa) {
        String hex = hexa.replaceAll("0x", "");
        return Integer.parseInt(hex, 16);
    }

    // let's ask user direction to convert
    private static String getDirection() {
        String direction = "";
        while (direction.isEmpty()) {
            System.out.println("convert from what?");
            System.out.println(" D) from Decimal to Hexadecimal");
            System.out.println(" H) from Hexadecimal to Decimal");
            System.out.println(" Q) Quit program");
            System.out.print("Your choice --> ");
            direction = sc.nextLine();
            // check if Quit
            if (direction.equalsIgnoreCase("q")) {
                System.out.println("\nBye-Bye :)\n");
                System.exit(0);
            }
            // RegEx (?i) - ignore letter case
            // RegEx [DH] - only allowed the characters D, d, H, h
            if (!direction.matches("(?i)[DH]")) {
                System.out.println("Invalid input! (" + direction
                        + ") !Must be D or H or Q!\nTry again\n");
                direction = "";
            }
        }
        return direction;
    }

    // let's ask user for decimal number to convert
    private static String getDecimal() {
        String decimal;
        do {
            System.out.println("enter decimal number: ");
            decimal = sc.nextLine().trim();
            if (!decimal.matches("(-?)\\d+")) {
                System.out.println("not a decimal!");
                decimal = "";
            }
        } while (decimal.isEmpty());
        return decimal;
    }

    // let's ask user for hexadecimal number to convert
    private static String getHexa() {
        String hexa;
        do {
            System.out.println("enter hexa-decimal number: ");
            hexa = sc.nextLine().trim();
            if (!hexa.matches("^0x[0-9A-Fa-f]+$")) {
                System.out.println("not hexa-decimal!");
                hexa = "";
            }
        } while (hexa.isEmpty());
        return hexa;
    }

    // let's print out result using direction and number we got
    private static void printResult(String direction, String number) {
        System.out.println("Converted number is: "
                + (direction.equalsIgnoreCase("D")
                ? ("0x" + decimalToHexa(number))
                : hexaToDecimal(number)));
        System.out.println();
    }
}