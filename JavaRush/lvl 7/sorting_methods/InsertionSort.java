import java.util.Arrays;

// let's make insertion sort function
public class InsertionSort {

    public static void main(String[] args) {

        int size = 17;
        int[] array = new int[size];

        fillRandom(array);
        System.out.println("random: " + Arrays.toString(array));

        sortInsertion(array);
        System.out.println("insertion sort: " + Arrays.toString(array));
    }

    // let's write random filler for the array
    public static void fillRandom(int[] array) {
        for (int i = 0, len = array.length; i < len; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    /* let's write insertion sort function
    time complexity: n iterations for n elements: O(n^2)
    1. take (i + 1)-th value
    2. compare it with previous value (that must be >= 0)
    3. if its smaller - swap it
    4. repeat step 2
    5. repeat until sorted
    */
    public static void sortInsertion(int[] array) {
        for (int i = 1, len = array.length; i < len; i++) {
            int insertValue = array[i];
            int j = i - 1; // previous value;
            while (j >= 0 && insertValue < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = insertValue; // here we inserting our value to previous position
        }
    }
}