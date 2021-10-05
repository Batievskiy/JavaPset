import java.util.ArrayList;

public class Robot {

    private double x = 0;
    private double y = 0;
    protected double course = 0;

    // The Robot is controlled by the Operator
    public Operator operator;

    // List of lines that Robot moves
    private ArrayList<RobotLine> lines = new ArrayList<>();

    // Robot constructor
    public Robot (double x, double y) {
        this.x = x;
        this.y = y;
    }

    // You can find out which operator controls the robot
    public Operator getOperator() {
        return operator;
    }

    // You can set an Operator for the Robot
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void moveForward(int distance) {
        // store old coordinates
        final double xOld = x;
        final double yOld = y;
        // change coordinates
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);

        // store coordinates of the path
        lines.add(new RobotLine(xOld, yOld, x, y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }

    public void printCoordinates() {
        System.out.println(x + ", " + y);
    }
}
