import java.util.Arrays;

// how to copy an arrays?
public class CopyArray {

    public static void main(String[] args) {

        int[] fibonacci = new int[20];
        fibonacci[0] = 1; // starting fibonacci numbers
        fibonacci[1] = 1;

        // filling an array with fibonacci numbers for fun
        for (int i = 2, len = fibonacci.length; i < len; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i -2];
        }
        System.out.println(Arrays.toString(fibonacci));

        // create an array arrB length of 5 from arrA
        int[] arrB = Arrays.copyOf(fibonacci, 5);
        String strB = Arrays.toString(arrB); // copy arrB to string
        System.out.println("stringB: " + strB);

        // create an array arrC length of 7 from arrB
        // here is the trick - arrB is shorter than new arrC
        // that's why arrB elements over length of arrC is gonna be filled with 0 values
        int[] arrC = Arrays.copyOf(arrB, 7);
        String strC = Arrays.toString(arrC);
        System.out.println("stringC: " + strC);

        // copy range of an array fibonacci from index [5] to [15]
        int[] sortedArr = Arrays.copyOfRange(fibonacci, 5, 15);

        // and sort it with QuickSort
        Arrays.sort(sortedArr);
        System.out.println("sortedArr" + Arrays.toString(sortedArr));
    }
}