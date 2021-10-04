public class InterfacePrimitive {
}

// can contain abstract methods only
interface Drawable {
    void draw();
}

// all the methods of the interface are public
interface HasValue {
    int getValue();
}

// interface can only extend an interface
interface Element extends Drawable, HasValue {
    int getX();

    int getY();
}

// class can be inherited from multiple interfaces
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

interface StudentInterface {
    public String getName();
}

class StudentClass implements StudentInterface {
    private String name;

    public StudentClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
