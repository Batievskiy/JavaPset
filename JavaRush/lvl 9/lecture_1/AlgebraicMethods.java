// let's check some if Algebraic Methods in Java Math.

import java.util.Scanner;

public class AlgebraicMethods {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Algebraic Methods in Java >---");

        double number = getNumber();
        System.out.println("square root of " + number + " is: " + Math.sqrt(number));
        System.out.println("cube root of " + number + " is: " + Math.cbrt(number));
        System.out.println("power ^2 of " + number + " is: " + Math.pow(number, 2));
        System.out.println("exponential of " + number + " is: " + Math.exp(number));
        System.out.println("log of " + number + " is: " + Math.log(number));
        System.out.println("log_10 of " + number + " is: " + Math.log10(number));
        System.out.println("log_ip of " + number + " is: " + Math.log1p(number));
        System.out.println("exp_m1 of " + number + " is: " + Math.expm1(number));
    }

    private static double getNumber() {
        String number;
        do {
            System.out.print("enter a number: ");
            number = sc.nextLine();
            if (!number.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$")) {
                System.out.println("this is not a number! Try again!");
                number = "";
            }
        } while (number.isEmpty());
        return Double.parseDouble(number);
    }
}
