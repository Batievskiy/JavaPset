import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// how to sort an arrays?
/* ask user array length and fill it with random values
// sort the array from low to high / from high to low
*/
public class SortIntArray {

    public static int[] array;
    public static Integer[] intArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array length: ");
        int arrLength = sc.nextInt();
        array = new int[arrLength];

        random(array); // fill array with random values

        Arrays.sort(array); // this is easiest way of sorting an array
        System.out.println("from low to high: " + Arrays.toString(array));

        // but let's sort it from low to high by using loops
        random(array);
        System.out.println("sort using for loop");
        int temp = 0;
        for (int i = 0, len = array.length; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (array[i] > array[j]) { // if elements not in order then swap
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("from low to high: " + Arrays.toString(array));

        // Collections.reverseOrder don't work for primitives like int
        intArr = new Integer[arrLength];
        randomInteger(intArr);

        // sort from low to high
        Arrays.sort(intArr, Collections.reverseOrder());

        System.out.println("from high to low: " + Arrays.toString(intArr));

        randomInteger(intArr);
        System.out.println("sort using for loop");
        for (int i = 0, len = intArr.length; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (intArr[i] < intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        System.out.println("from high to low: " + Arrays.toString(intArr));
        sc.close();
    }

    // random array filler function for int[]
    static void random(int[] rand) {
        for (int i = 0, len = rand.length; i < len; i++) {
            rand[i] = (int) (Math.random() * 100);
        }
    }

    // random array filler function for Integer[]
    static void randomInteger(Integer[] rand) {
        for (int i = 0, len = rand.length; i < len; i++) {
            rand[i] = (int) (Math.random() * 100);
        }
    }
}
