import java.util.Arrays;

// let's make selection sort function
public class SelectionSort {

    public static void main(String[] args) {

        int size = 17;
        int[] array = new int[size];

        fillRandom(array);
        System.out.println("random: " + Arrays.toString(array));

        sortSelection(array);
        System.out.println("selection sort: " + Arrays.toString(array));
    }

    // let's write random filler for the array
    public static void fillRandom(int[] array) {
        for (int i = 0, len = array.length; i < len; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    /* let's write selection sort function
    time complexity: n iterations for n elements: O(n^2)
    1. set i-th value as min
    2. compare with next values until find smallest
    3. update min value
    4. swap i-th value with min value
    5. repeat until sorted
     */
    public static void sortSelection(int[] array) {

        for (int i = 0, len = array.length; i < len; i++) {
            int minValue = array[i]; // starting minimal value to compare with
            int minIndex = i;
            for (int j = i + 1; j < len; j++) { // for each i + 1 index compare value with min
                if (array[j] < minValue) { // if it is less than minimal value
                    minValue = array[j]; // assign new minimal value
                    minIndex = j; // and save its new index
                }
            }
            // swap the minimum with current value
            int tempValue = array[i];
            array[i] = minValue;
            array[minIndex] = tempValue;
        }
    }
}