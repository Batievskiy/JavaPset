import java.util.Arrays;

// how to fill an arrays?
public class ArraysFill {

    public static void main(String[] args) {

        int[] fibonacci = new int[10];
        fibonacci[0] = 1; // starting fibonacci numbers
        fibonacci[1] = 1;

        // filling an array with fibonacci numbers for fun
        for (int i = 2, len = fibonacci.length; i < len; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        // print array in one line
        System.out.println("fibonacci: " + Arrays.toString(fibonacci));

        // print all elements of an array one at new line
        // Arrays.stream(fibonacci).forEach(System.out::println);

        int[] arrB = new int[11];
        // filling each element of the array arrB with dummy 0 values
        Arrays.fill(arrB, 1);
        System.out.println("arrB: " + Arrays.toString(arrB));

        int[] arrC = new int[12];
        // filling part of the array arrC
        // from index arrC[3] to index arrC[10]th element
        // with 0 values
        Arrays.fill(arrC, 3, 9, 2);

        System.out.println("arrC: " + Arrays.toString(arrC));

    }
}