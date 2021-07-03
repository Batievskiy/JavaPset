public class ProProgrammerJavaRush {

}
// correct way of creating class
class Point {
    private int x;
    private int y;

    // create Constructor first
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // create get method for returning variable x
    public int getX() {
        return x;
    }

    // create set method for changing variable x
    public void setX(int x) {
        this.x = x;
    }

    // create get method for returning variable y
    public int getY() {
        return y;
    }

    // create set method for changing variable Y
    public void setY(int y) {
        this.y = y;
    }
}
