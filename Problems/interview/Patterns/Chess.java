// let's print out Chess Board
public class Chess {
    public static String color(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";

        if (a > 7 || b > 7) {
            return null;
        } else {
            return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
        }
    }

    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        int length = chess.length;
        int lengthSub = chess[0].length;

        for (int row = 0; row < length; row++) {
            for (int column = 0; column < lengthSub; column++) {
                if ((row + column) % 2 == 0) { // check if even
                    chess[row][column] = "W" + color(row, column);
                } else {
                    chess[row][column] = "B" + color(row, column);
                }
            }
        }

        for (int row = 0; row < length; row++) {
            for (int column = 0; column < lengthSub; column++) {
                System.out.print(" " + chess[row][column] + " ");
            }
            System.out.println();
        }
    }
}
