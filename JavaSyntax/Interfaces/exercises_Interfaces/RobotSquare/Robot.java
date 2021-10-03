import java.util.ArrayList;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0;

    private ArrayList<RobotLine> lines = new ArrayList<>();

    // reference to the robot's listener interface
    private RobotListener listener;

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // the method to set real Listener
    public void setListener(RobotListener listener) {
        this.listener = listener;
    }

    public void forward(int distance) {
        // call the listener (if its set) at the beginning
        if (listener != null) {
            listener.startMove(x, y);
        }

        // store the coordinates of the Robot before moving
        final double xOld = x;
        final double yOld = y;

        // change the coordinates
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);

        // call the listener (if its set) after stopping the Robot
        if (listener != null) {
            listener.endMove(x, y);
        }

        // store the coordinates of distance passed
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
}
