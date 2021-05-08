// printing out multiplication table from two arrays

// explanation for Dummies in programming like Me

public class MultiplicationTable {
    public static int[][] mTable; // here we made two dimentional array

    public static void main(String[] args) {

        mTable = multiplication_table(10, 10); // here we used recalled function

        // for each row from 0 until < mTable length
        // and for each column from 0 until < mTable[row].length
        //  1. print mTable[row][column] variables
        //  2. print next line
        for (int row = 0, lenT = mTable.length; row < lenT; row++) {
            for (int column = 0, lenC = mTable.length; column < lenC; column++) {
                System.out.printf("%2d ", mTable[row][column]); // used %2d for better spacing
            }
            System.out.println();
        }
    }

    // this is function that is gonna calculate row * column in array of mTable
    // why we use (row + 1) because first row[0] and first column[0] at the end of a loop
    // but we want to start to multiply from row[1] and column[1]
    // for each row from 0 until < mTable length
    //  and for each column from 0 until < mTable[row].length
    //      1. calculate (row + 1) * (column + 1) and store it to mTable[row][column] array
    public static int[][] multiplication_table(int rows, int columns) {
        int[][] mTable = new int[rows][columns];
        for (int row = 0, lenT = mTable.length; row < lenT; row++) {
            for (int column = 0, lenC = mTable[row].length; column < lenC; column++) {
                mTable[row][column] = (row + 1) * (column + 1);
            }
        }
        return mTable;
    }
}
