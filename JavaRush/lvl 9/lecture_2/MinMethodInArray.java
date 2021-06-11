// JavRush problem
// create method to fill array of 10 numbers from user input
// find min of that numbers using Math.min(int, int)

import java.util.Scanner;

public class MinMethodInArray {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println("min number is: " + min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = getNumber();
        }
        return array;
    }

    public static int getNumber() {
        String number;
        do {
            System.out.print("enter number: ");
            number = sc.nextLine();
            if (!number.matches("^(-?)([1-9]\\d*|0)$")) {
                System.out.println("not a number!");
                number = "";
            }
        } while (number.isEmpty());
        return Integer.parseInt(number);
    }
}
