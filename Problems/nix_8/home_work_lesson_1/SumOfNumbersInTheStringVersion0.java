// 1. Get the string from user in console.
// 2. Find sum of all numbers in the string.

import java.util.Scanner;

class SumOfNumbersInTheStringVersion0 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string = scanner.nextLine();

        System.out.println(sumAllNumbersInString(string));

        scanner.close();
    }

    private static int sumAllNumbersInString(String string) {
        int sum = 0;
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            if (Character.isDigit(string.charAt(i))) {
                String oneCharString = string.substring(i, i + 1);
                sum += Integer.parseInt(oneCharString);
            }
        }
        return sum;
    }
}