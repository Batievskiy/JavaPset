import java.util.Arrays;
import java.util.Collections;

// how to reverse an array?
// let's take three ways to do that
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("int array original: ");
        printArray(array);

        reverseA(array);

        System.out.print("int array reversed: ");
        printArray(array);

        char[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.print("char original array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        reverseB(charArray, charArray.length);

        Integer[] listArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("original ArrayList: " + Arrays.asList(listArray));
        reverseL(listArray);
    }

    // for in-place reversal array:
    // we have to take half of the array and
    // swap i-th element with (array length - 1 - i-th) element in each loop cycle
    public static void reverseA(int[] array) {
        for (int i = 0, len = array.length; i < len / 2; i++) {
            int tmp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = tmp;
        }
    }

    // reverse with traditional for loop with array's copy
    public static void reverseB(char[] charArray, int l) {
        char[] arrayCopy = new char[l];
        int j = l;
        for (int i = 0; i < l; i++) {
            arrayCopy[j - 1] = charArray[i];
            j = j - 1;
        }

        System.out.print("char array reversed: ");
        for (int k = 0; k < l; k++) {
            System.out.print(arrayCopy[k] + " ");
        }
        System.out.println();
    }

    // reverse using ArrayList
    public static void reverseL(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
        System.out.println("reversed ArrayList: " + Arrays.asList(array));
    }

    // print an array using for loop
    // dumb way, I know but for studying purpose it's OK
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
