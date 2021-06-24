// let's count Min and Max in Array
import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinMaxInArray {
    public static void main(String[] args) {
        System.out.println("---< Min and Max in Array >---\n");

        int[] arr = new int[]{24, 13, -1, 2, 4, 70, 44};

        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("1. using for loop ->");
        System.out.println("min in array: " + min(arr));
        System.out.println("max in array: " + max(arr));
        System.out.println();

        System.out.println("2. using Java Streams ->");
        System.out.println("min in array: " + minValue(arr));
        System.out.println("max in array: " + maxValue(arr));
        System.out.println();
    }

    // 1. using for loop
    private static int min(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    private static int max(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 2. using Java Streams
    private static int minValue(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow(NoSuchElementException::new);
    }
    private static int maxValue(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new);
    }
}
