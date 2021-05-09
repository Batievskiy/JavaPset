import java.util.Scanner;
// ask user for array size
// create an array size of N
// ask user for each row array size for second dimension
// print out multiplication table in this 2D array

public class MultiArray {
    public static int[][] multiArray;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("array size: ");
        int arrSize = sc.nextInt();

        multiArray = new int[arrSize][];

        for (int row = 0; row < multiArray.length; row++) {
            System.out.print("row" + "[" + (row + 1) + "] " + "size: ");
            int rowSize = sc.nextInt();
            multiArray[row] = new int[rowSize];
        }

        for (int row = 0; row < multiArray.length; row++) {
            for (int col = 0; col < multiArray[row].length; col++) {
                multiArray[row][col] = (row + 1) * (col + 1);
                System.out.printf("%2d ", multiArray[row][col]);
            }
            System.out.println();
        }
        sc.close();
    }
}