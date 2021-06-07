// take two numbers from user input
// and print out its sum

import java.util.Scanner;

public class AddTwoNumbersV2 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---< Add Two Numbers >---");
        int number1, number2, sum;
        number1 = getNumber("first");
        number2 = getNumber("second");

        sc.close();
        sum = number1 + number2;
        System.out.println("sum of " + number1
                + " and " + number2 + " is: " + sum);
    }

    private static int getNumber(String which) {
        String number = "";
        while (number.isEmpty()) {
            System.out.print("enter " + which + " number: ");
            number = sc.nextLine();
            if (!number.matches("^-?\\d+$")) {
                System.out.println("this is not a number! Try again!");
                number = "";
            }
        }
        return Integer.parseInt(number);
    }
}
