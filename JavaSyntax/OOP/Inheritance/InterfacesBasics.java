

public class InterfacesBasics {
    public static void main(String[] args) {

    }
}

interface Drawable {
    void draw();
}

interface HasValue {
    int getValue();
}

// interface inheritance
interface Element extends Drawable, HasValue {
    int getX();

    int getY();
}

// class inheritance from interface
abstract class ChessItem implements Drawable, HasValue {
    private int x, y, value;

    public int getValue() {
        return value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}