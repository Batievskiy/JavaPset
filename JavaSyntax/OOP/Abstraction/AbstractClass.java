import java.util.ArrayList;

public class AbstractClass {
    public static void main(String[] args) {
        // we can't create an abstract class
//        ChessItem1 chessItem1 = new ChessItem1(); // because it's not implemented

        // but we can create a child class item
        ChessItem item = new Queen();
        item.draw();

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
abstract class ChessItem {
    public int x, y; // coordinates
    private int value; // value of the Item

    public int getValue() {
        return this.value;
    }

    public abstract void draw(); // abstract method without implementation

    // implementation example:
//    public void draw() {
//        System.out.println("Item has drawn");
//    }
}

// inheritance from abstract class force us
// to override all methods that hasn't been implemented
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