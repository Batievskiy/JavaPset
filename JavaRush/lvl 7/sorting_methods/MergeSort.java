import java.util.Scanner;

// let's take a look on a Merge Sort algorithm
public class MergeSort {
    public static void main(String[] args) {

        /*
        1. sort the left half of the array (recursively)
        2. sort the right half of the array (recursively)
        3. and Merge the solutions
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
        System.out.print("merge sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;
        // here we are merging subarrays
        while (l < left_size && r < right_size) { // simple counters -repeat until < left and right array length

            if (left_arr[l] < right_arr[r]) { // compare if value from left side is smaller than a value from right side
                arr[i++] = left_arr[l++]; // then copy smaller value to first place
            } else {
                arr[i++] = right_arr[r++]; // but if right value is smaller - copy it to first place
            }
        }
        while (l < left_size) { // proceed while our l counter less than left size
            arr[i++] = left_arr[l++]; // and copy all values from left part of the array
        }
        while (r < right_size) { // proceed after our r counter less than right size
            arr[i++] = right_arr[r++]; // and copy all values from right part of the array
        }
    }

    public static void mergeSort(int[] arr, int len) {

        // we have to check if array is too small for sorting(less than 2 obviously)
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left_arr = new int[mid]; // whe have to create new array for the left part of original array
        int[] right_arr = new int[len - mid]; // and create new array for the right part of original array

        // here we gonna divide array into two parts and copy into two separate arrays
        int rt = 0;
        for (int lt = 0; lt < len; ++lt) {
            if (lt < mid) {
                left_arr[lt] = arr[lt]; // copying the left part
            } else {
                right_arr[rt] = arr[lt]; // and copying the right pary
                rt = rt + 1;
            }
        }

        // here we are calling the function (recursively) to divide the subarrays until its part consists 1 element
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
