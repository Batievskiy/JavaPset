import java.util.Arrays;

// how to find Missing number in array of 1 to 100?
// let's find out
public class MissingNumberInArray {
    public static void main(String[] args) {

        // one missing number
        int[] arr1 = new int[]{1, 2, 3, 4, 6};
        System.out.println(MissingNumber(arr1, arr1.length));

    }
    private static int MissingNumber(int[] arr, int len) {
        int a = arr[0];
        int b = 1;

        for (int i = 1; i < len; i++) {
            a = a ^ arr[i];
        }

        for (int i = 2; i <= len + 1; i++) {
            b = b ^ i;
        }
        return (a ^ b);
    }
}