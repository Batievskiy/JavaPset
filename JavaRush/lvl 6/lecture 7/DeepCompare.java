import java.util.Arrays;

// how to compare two arrays?
public class DeepCompare {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {

        // this return false. but why?
        // because it is compare address of arrayFirst and address if arraySecond
        System.out.println(arrayFirst == arraySecond);

        // maybe Arrays.equals() hill help?
        // this also return false. but... how is that?
        // same thing - it is compare addresses!
        System.out.println(Arrays.equals(arrayFirst, arraySecond));

        // to compare two arrays we have to use Arrays.deepEquals method
        // and now - this return true
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}