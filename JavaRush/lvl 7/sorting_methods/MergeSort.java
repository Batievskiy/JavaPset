import java.util.Arrays;
import java.util.Scanner;

// let's take a look on a Merge Sort algorithm
public class MergeSort {
    public static void main(String[] args) {

        /*
        1. sort the left half of the array (recursively)
        2. sort the right half of the array (recursively)
        3. and Merge the solutions
         */
        /*
        is that simple? - NOT actually
         */

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
        fillRandom(array);

        mergeSort(array, array.length);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;
        // The while loops check the conditions for merging
        while (l < left_size && r < right_size) {

            if (left_arr[l] < right_arr[r]) {
                arr[i++] = left_arr[l++];
            } else {
                arr[i++] = right_arr[r++];
            }
        }
        while (l < left_size) {
            arr[i++] = left_arr[l++];
        }
        while (r < right_size) {
            arr[i++] = right_arr[r++];
        }
    }

    public static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[len - mid];

        // Dividing array into two and copying into two separate arrays
        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k = k + 1;
            }
        }
        // Recursively calling the function to divide the subarrays further
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);
        // Calling the merge method on each subdivision
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

    // let's write random filler for the array
    public static void fillRandom(int[] array) {
        for (int i = 0, len = array.length; i < len; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}