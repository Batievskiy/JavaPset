// 1. Get the string from user in console.
// 2. Parse all numbers from this string.
// 3. Find sum of all numbers in the string.

package hw_1;

import java.util.Scanner;

public class SumOfNumbersInTheString {
    public static Scanner SCANNER = new Scanner(System.in);

    public static void run() {
        title();
        play();
    }

    private static void play() {
        // let's create a flag to loop the game ;)
        boolean isPlay = true;

        while (isPlay) {
            String string = getString();
            String numbersFromString = getNumbersFromString(string);
            long sum = sumNumbers(numbersFromString);
            printSumOfNumbersInString(sum);

            // and let's ask user to play more ;)
            System.out.print("Want more? ( Y / N ) - > ");
            String s = "";
            while (s.isEmpty()) {
                s = SCANNER.nextLine();
                if (!s.toLowerCase().matches("[y]")) {
                    System.out.println("Bye-Bye ;)\n");
                    isPlay = false;
                    break;
                }
            }
        }
    }

    private static void title() {
        System.out.println("\n---< Parse all numbers from String and Sum them all >---\n");
    }

    private static String getString() {
        System.out.print("Input a string -> ");
        return SCANNER.nextLine();
    }

    private static String getNumbersFromString(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            // let's take digits only
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
