// 1. Get the string from user in console.
// 2. Parse all numbers from this string.
// 3. Find sum of all numbers in the string.

import java.util.Scanner;

public class SumOfNumbersInTheStringVersion1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        title();
        String string = getString();
//        printString(string);
        String numbersFromString = getNumbersFromString(string);
//        printNumbersFromString(numbersFromString);
        long sum = sumNumbers(numbersFromString);
        printSumOfNumbersInString(sum);

        scanner.close();
    }

    private static void title() {
        System.out.println("\n---< Parse all numbers from String and Sum them all >---\n");
    }

    private static String getString() {
        System.out.print("Input a string -> ");
        return scanner.nextLine();
    }

    private static void printString(String string) {
        System.out.println("your String is -> " + string);
        System.out.println();
    }

    private static void printNumbersFromString(String string) {
        System.out.println("numbers from your string is -> " + string);
    }

    private static String getNumbersFromString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isDigit(character)) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }

    private static long sumNumbers(String string) {
        long sum = 0;
        for (int i = 0; i < string.length(); i++) {
            String oneCharacter = string.substring(i, i + 1);
            sum += Integer.parseInt(oneCharacter);
        }
        return sum;
    }

    private static void printSumOfNumbersInString(long sum) {
        System.out.println("Sum of all numbers from String is -> " + sum + "\n");
    }
}
