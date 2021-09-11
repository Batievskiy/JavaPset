import java.util.ArrayList;

public class ParentClass {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.drawAllChessItems();

    }
}

class ChessBoard {
    public void drawAllChessItems() {
        ArrayList<ChessItem> items = new ArrayList<ChessItem>();
        items.add(new King());
        items.add(new Queen());
        items.add(new Bishop());

        for (ChessItem item : items) {
            item.draw();
        }
    }
}

// this is parent class
class ChessItem {
    public void draw() {
        System.out.println("Item has drawn");
    }

}

class King extends ChessItem {
        @Override
    public void draw() {
            System.out.println("King has drawn");
        }
}

class Queen extends ChessItem {
    @Override
    public void draw() {
        System.out.println("Queen has drawn");
    }
}

class Bishop extends ChessItem {
    @Override
    public void draw() {
        System.out.println("Bishop has drawn");
    }
}
