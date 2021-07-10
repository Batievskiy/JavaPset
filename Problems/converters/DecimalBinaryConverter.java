// let's create Decimal <-> Binary converter

import java.util.Scanner;

public class DecimalBinaryConverter {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Decimal <-> Binary converter >---\n");

        String direction = "";

        while (!direction.matches("(?i)[q]")) {
            direction = getDirection();
            if (direction.equalsIgnoreCase("d")) {
                String number = getDecimal();
                printResult(direction, number);
            } else {
                String number = getBinary();
                printResult(direction, number);
            }
        }
        String number = "";
        String result = convert(direction, number);
        printResult(direction, result);
        System.out.println();

//        System.out.println("Primitive way ->");
//        int decimalNumber = Integer.MAX_VALUE;
//        System.out.println("decimal number -> " + decimalNumber);
//        String binaryNumber = "101";
//        System.out.println("binary number -> " + binaryNumber);
//
//        System.out.println("toBinary ->" + toBinary(255));
//        System.out.println("toDecimal -> " + toDecimal(binaryNumber));
//        System.out.println("binToDec -> " + binToDec(binaryNumber));
//        System.out.println(100 % 10);
    }

    // let's get direction of conversion from user
    public static String getDirection() {
        String direction = "";

        // keep asking until user input
        while (direction.isEmpty()) {
            System.out.println("convert -> ");
            System.out.println("from Decimal to binary (D)");
            System.out.println("from Binary to decimal (B)");
            System.out.println("quit program (Q)");
            System.out.print("your choice -> ");
            direction = sc.nextLine().trim();
            // check "Quit" input
            if (direction.matches("(?i)[q]$")) {
                System.out.println("\nBye-Bye :)\n");
                System.exit(0);
            }
            // check proper input using RegEx
            // (?i) - Ignore Letter Case
            // [DB] - only allowed characters D, d, B, b
            if (!direction.matches("(?i)[DB]")) {
                System.err.println("Invalid direction! (" + direction +
                        ")! Must be D of B!");
                direction = "";
            }
        }
        return direction;
    }

    // get Integer from user
    public static String getDecimal() {
        String decimal = "";
        do {
            System.out.print("enter a Decimal number -> ");
            decimal = sc.nextLine().trim();
            if (!decimal.matches("^(-?)([0-9]+)$")) {
                System.out.println("this is not a Decimal number!");
                decimal = "";
            }
        } while (decimal.isEmpty());
        return decimal;
    }

    // get Binary from user
    public static String getBinary() {
        String binary = "";
        do {
            System.out.print("enter a Binary number -> ");
            binary = sc.nextLine().trim();
            if (!binary.matches("^(-?)([0-1]+)$")) {
                System.out.println("this is not a Binary number!");
                binary = "";
            }
        } while (binary.isEmpty());
        return binary;
    }

    // lets convert Decimal to Binary
    public static String toBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        if (decimalNumber <= 0) {
            return binary.toString();
        }
        while (decimalNumber != 0) {
            binary.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }
        return binary.toString();
    }

    // let's convert Binary to Decimal
    public static String toDecimal(String binaryNumber) {
        int decimal = 0;
        if (binaryNumber == null) {
            return String.valueOf(decimal);
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimal += value * Math.pow(2, i);
        }
        return String.valueOf(decimal);
    }

    public static int binToDec(String binaryNumber) {
        int decimal = 0;
        if (binaryNumber == null) {
            return decimal;
        }
        int temp = Integer.parseInt(binaryNumber);
        for (int i = 0; i < binaryNumber.length(); i++) {
            int value = temp % 10;
            temp /= 10;
            decimal += value * Math.pow(2, i);
        }
        return decimal;
    }

    //
    public static String convert(String direction, String number) {
        String result = "";
        if (direction.equalsIgnoreCase("d")) {
            result = toDecimal(number);
        } else {
            result = toBinary(Integer.parseInt(number));
        }
        return result;
    }

    // and let's print result
    public static void printResult(String direction, String number) {
        // Ternary Operator here
        System.out.println("Converted number is: "
                + (direction.equalsIgnoreCase("b")
                ? toDecimal(number)
                : toBinary(Integer.parseInt(number))));
        System.out.println();
    }
}