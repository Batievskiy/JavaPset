import java.util.Arrays;

public class SmileMatrix {

    // I just want to visualize what is 2D array looks like
    // also it's called MATRIX
    public static String[][] strings = new String[][]{
            {"🙂", "🙂", "🙂", "🙂"},
            {"🙃", "🙃", "🙃", "🙃"},
            {"😋", "😋", "😋", "😋"},
            {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {

        // this is print out ALL characters in strings[][] array
        System.out.println(Arrays.deepToString(strings));

        // this is print out ALL integers in ints[][] array
        System.out.println(Arrays.deepToString(ints));
    }
}