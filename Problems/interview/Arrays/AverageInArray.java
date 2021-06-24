// how to find average in Array?
// let's find out

import java.util.Arrays;

public class AverageInArray {
    public static void main(String[] args) {
        System.out.println("---< Average in Array >---\n");

        int[] arr = new int[]{1, 2, 7, 30, 5, 70, 44};

        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("1. using Java Stream API .sum() / array.length ->");
        System.out.println(getAverage(arr));
        System.out.println();

        System.out.println("2. using Java Stream API + .average() ->");
        System.out.println(findAverage(arr));
        System.out.println();

        System.out.println("3. using for loop ->");
        System.out.println(getAvg(arr));
        System.out.println();

        System.out.println("4. using enhanced for loop ->");
        System.out.println(findAvg(arr));
        System.out.println();

        System.out.println("5. using separate sum function ->");
        System.out.println(getAvrg(arr));
        System.out.println();
    }

    // 1. using Java Stream API .sum() / array.length
    private static double getAverage(int[] arr) {
        return (double) Arrays.stream(arr).sum() / (double) arr.length;
    }

    // 2. using Java Stream API + .average()
    private static double findAverage(int[] arr) {
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }

    // 3. using for loop
    private static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }

    // 4. using enhanced for loop
    private static double findAvg(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / (double) arr.length;
    }

    // 5. using separate sum function
    public static double getAvrg(int[] array) {
        int sum = findSum(array);
        return (double) sum / array.length;
    }

    private static int findSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}