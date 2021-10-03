import javax.swing.JFrame;

public class RobotSquareFrame extends JFrame {
    public RobotSquareFrame(Robot robot) {
        // set the frame title
        setTitle("Robot Square");
        // add a component to draw a path of the robot
        add(new RobotPathComponent(robot));
        // set size of the frame
        setBounds(100, 100, 500, 500);
    }
}
