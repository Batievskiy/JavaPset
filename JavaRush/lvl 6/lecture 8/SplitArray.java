import java.util.Arrays;
import java.util.Scanner;

/* ask user array length and fill it with random values
// divide array on two parts:
// if array length is odd - copy greater part to first sub array
// if array length is even - copy even parts fo first and second sub array
*/
public class SplitArray {

    public static int[][] result = new int[2][];
    public static int[] array;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("array length: ");
        int arrLen = sc.nextInt();

        array = new int[arrLen];
        random(array);

        int length;
        if (array.length % 2 == 0) {
            length = array.length / 2;
        }
        else {
            length = array.length / 2 + 1;
        }
        result[0] = Arrays.copyOfRange(array, 0, length);
        result[1] = Arrays.copyOfRange(array, length, array.length);

        System.out.println(Arrays.deepToString(result));

        /* another way to do that
        int first = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;

        result[0] = Arrays.copyOfRange(array, 0, first);
        result[1] = Arrays.copyOfRange(array, first, array.length);

        System.out.println(Arrays.deepToString(result));
        */
    }

    static void random(int[] rand) {
        for (int i = 0, len = rand.length; i < len; i++) {
            rand[i] = (int)(Math.random() * 100);
        }
    }
}