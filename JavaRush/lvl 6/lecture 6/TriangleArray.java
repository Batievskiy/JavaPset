// Create two dimentional triangle array from 0 to 10
// with each value is sum of its indexes
// result[row][col] = row + col

public class TriangleArray {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        for (int row = 0; row < result.length; row++) {
            result[row] = new int[row + 1];

            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = row + col;
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}
