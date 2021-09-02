import java.util.Arrays;

public class MinInArrayRecursive {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 6, 8, 9};
        System.out.println("array -> " + Arrays.toString(array));
        System.out.println("minimum number -> " + getMin(array, 0, array.length));
    }

    public static int getMin(int[] intArr, int startIndex, int length) {
        // return first element if only one element or minimum of the array element
        return (length == 1) ? intArr[startIndex] :
                Math.min(intArr[startIndex], getMin(intArr, startIndex + 1, length - 1));
    }
}
