import java.util.Arrays;
import java.util.Scanner;

// how to create and call methods in Java
// on examples of all sorting algorithms
public class Sort {

    public static void main(String[] args) {
        // let's make our program little bit interactive
        // ask user for array size:
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("array size (2 to 20): ");
            size = sc.nextInt();
        } while (size < 2 || size > 20);
        sc.nextLine(); // just move cursor to new line - weird scanner bug after reading integers

        // now let's create an array to work with
        int[] array = new int[size];

        // and fill it with some random numbers using method
        fillRandom(array); // nice

        // now let's ask user what type of sorting to implement at this array
        System.out.println("all sorting types:");

        String type;
        do {
            System.out.println("what sorting type you prefer?");
            System.out.println("bubble / insertion / selection / merge / heap / quick");

            type = sc.nextLine();
        } while (!type.equals("bubble") && !type.equals("insertion") && !type.equals("selection") && !type.equals("merge") && !type.equals("heap") && !type.equals("quick"));

        if (type.equals("bubble")) {
            sortBubble(array);
            System.out.println(type + " sort: " + Arrays.toString(array));
        }

        if (type.equals("selection")) {
            sortSelection(array);
            System.out.println(type + " sort: " + Arrays.toString(array));
        }

        if (type.equals("insertion")) {
            sortInsertion(array);
            System.out.println(type + " sort: " + Arrays.toString(array));
        }

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

    /* let's write merge sort function
    time complexity: n iterations for n elements: O(nlog n)
    */


}