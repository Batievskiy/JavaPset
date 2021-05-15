import java.util.Arrays;

// let's make bubble sort for fun
public class BubbleSort {

    public static void main(String[] args) {

        int size = 17;
        int[] array = new int[size];

        fillRandom(array);
        System.out.println("random: " + Arrays.toString(array));

        sortBubble(array);
        System.out.println("bubble sort: " + Arrays.toString(array));
    }

    // let's write random filler for the array
    public static void fillRandom(int[] array) {
        for (int i = 0, len = array.length; i < len; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    /* let's write bubble sort function
    time complexity: n iterations for n elements: O(n^2)
    1. take i-th value and compare with next value
    2. if its smaller - swap them
    3. repeat until sorted
    */
    public static void sortBubble(int[] array) {
        boolean sorted = false;
        int tempValue; // for comparing with current i-th value
        while (!sorted) { // we have to iterate with all elements while they not sorted
            sorted = true;
            for (int i = 0, len = array.length; i < len - 1; i++) { // comparing each i-th element with temp
                if (array[i] > array[i + 1]) { // if current value is bigger than next - swap it
                    tempValue = array[i];
                    array[i] = array[i + 1]; // shifting index of current value by 1 forward (like bubble)
                    array[i + 1] = tempValue;
                    sorted = false;
                }
            }
        }
    }
}