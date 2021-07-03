// we can validate variables inside of set methods
public class GetSetValidateJavaRush {
}

class Point {
    private int x;
    private int y;

    // validate for x and y not less than
    public Point(int x, int y) {
        this.x = (x < 0) ? 0 : x;
        this.y = (y < 0) ? 0 : x;
    }

    public int getX() {
        return x;
    }
    // validate x not less than 0
    public void setX(int x) {
        this.x = (x < 0) ? 0 : x;
    }
    public int getY() {
        return y;
    }
    // validate not less than 0
    public void setY(int y) {
        this.y = (y < 0) ? 0 : y;
    }
}
