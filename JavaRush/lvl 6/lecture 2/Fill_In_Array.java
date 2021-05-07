import java.util.Arrays;

// create two arrays; fill it in; and join two arrays together
public class Fill_In_Array {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int lenF = firstArray.length;
        int lenS = secondArray.length;
        resultArray = new int[lenF + lenS];
        int lenR = resultArray.length;

        for (int i = 0; i < lenR; i++) {
            if (i < lenF) {
                resultArray[i] = firstArray[i];
            } else {
                resultArray[i] = secondArray[i - lenF];
            }
        }
        System.out.println(Arrays.toString(resultArray));

    }
}
