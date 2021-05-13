import java.util.Arrays;
import java.util.Scanner;

// create an array and ask user array length
// if an array length is even - fill 1st half of the array with 1st value and 2nd half with 2nd value
// if the array length is odd - fill greater half with 1st value and 2nd less part with 2nd value
public class EvenOddFill {

    public static int[] array;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("array length: ");
        int len = sc.nextInt();
        array = new int[len];

        System.out.print("valueStart: ");
        int valueStart = sc.nextInt();

        System.out.print("valueEnd: ");
        int valueEnd = sc.nextInt();

        String number;

        if (array.length % 2 == 0) {
            len = array.length / 2;
            number = "even";
        }
        else {
            len = array.length / 2 + 1;
            number = "odd";
        }

        Arrays.fill(array, 0, len, valueStart);
        Arrays.fill(array, len, array.length, valueEnd);

        /* Short way to do same
        int first = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, first, valueStart);
        Arrays.fill(array, first, array.length, valueEnd);
        */

        System.out.println("length is " + number + ": " + Arrays.toString(array));
    }
}