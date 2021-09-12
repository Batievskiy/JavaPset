public class InterfaceMultiInheritance {
    public static void main(String[] args) {

    }
}

// class cannot extends multiple classes
// because they are uses the same value of the parent class Date
//class ZCoordinate extends YCoordinate, XCoordinate {
//
//}

// parent class stores value;
class Date {
    protected int value;
}

// inherited class uses value of parent class Date
class XCoordinate extends Date {
    public void setX(int x) {
        value = x;
    }

    public int getX() {
        return value;
    }
}

//inherited class uses same value of parent class Date
class YCoordinate extends Date {
    public void setY(int y) {
        value = y;
    }

    public int getY() {
        return value;
    }
}

