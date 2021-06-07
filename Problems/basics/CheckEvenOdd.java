// take number from user input
// check is it Even of Odd

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("enter a number: ");
        number = sc.nextInt();
        // using `modulo` operator that returns remainder
        // 0 for even numbers or 1 for odd numbers
        if (number % 2 == 0) {
            System.out.println("number " + number + " is Even");
        } else {
            System.out.println("number " + number + " is Odd");
        }

    }
}
