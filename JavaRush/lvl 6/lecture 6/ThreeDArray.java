import java.util.Arrays;

public class ThreeDArray {

    public static int[][][] threeDArray;

    public static void main(String[] args) {
        threeDArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

        // how to count Big O of this nested nested nested
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
            }
        }

        /* simplest way to print out all numbers, but a bit different look
        System.out.println(Arrays.deepToString(threeDArray));
        */
    }
}
