// Create an array size of users input number
// check numbers from users input in separate method using Regular Expressions
// fill in array with users input numbers one at the time
// calculate min value in the array
import java.util.Scanner;

public class MinInArray {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String what = "enter the array size (up to 10): ";
        String upTo10 = "^([1-9]|10)";
        int size = getInt(what, upTo10);

        int[] array = new int[size];
        what = "enter number: ";
        String anyNum = "^(-?)([1-9]\\d*|0)$";
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt(what, anyNum);
        }

        int min = minFromArray(array);
        System.out.println("min value in the array: " + min);
    }

    private static int getInt(String what, String regEx) {
        String size;
        do {
            System.out.print(what);
            size = sc.nextLine().trim();
            if (!size.matches(regEx) && regEx.equals("^([1-9]|10)")) {
                System.out.println("Must be number from 1 to 10!");
                size = "";
            }
            if (!size.matches(regEx) && regEx.equals("^(-?)([1-9]\\d*|0)$")) {
                System.out.println("Not a number! Try again!");
                size = "";
            }

        } while(size.isEmpty());
        return Integer.parseInt(size);
    }

    private static int minFromArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) {
                min = array[i + 1];
            }
        }
        return min;
    }
}
