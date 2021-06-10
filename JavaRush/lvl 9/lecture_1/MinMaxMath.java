// Min Max methods in Java

import java.util.Scanner;

public class MinMaxMath {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Find Min and Max from three numbers >---");
        int n1 = getNumber("first");
        int n2 = getNumber("second");
        int n3 = getNumber("third");
        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));

        System.out.println("Max from " + n1 + ", " + n2 + " and "+ n3 + " is: " + max);
        System.out.println("Min from " + n1 + ", " + n2 + " and "+ n3 + " is: " + min);
    }

    private static int getNumber(String which) {
        String number;
        do {
            System.out.print("enter " + which + " number: ");
            number = sc.nextLine();
            if (!number.matches("^-?\\d+")) {
                System.out.println("This is not a number! Try again!");
                number = "";
            }
        } while (number.isEmpty());
        return Integer.parseInt(number);
    }
}
