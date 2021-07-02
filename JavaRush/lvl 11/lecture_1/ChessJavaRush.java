// JavaRush lvl 11 lecture 1
// piece od Chess game

import java.awt.*;

public class ChessJavaRush {
    public static void main(String[] args) {
        var board = ChessBoard.getBoard();
        board.cells[0][3] = new King(Color.WHITE);
        board.cells[0][4] = new Queen(Color.WHITE);
        ...
    }
}
public class ChessBoard {
    public static ChessBoard board = new ChessBoard();
    public static ChessBoard getBoard() {
        return board;
    }
    public ChessItem[][] cells = new ChessItem[8][8];
    ...
}
