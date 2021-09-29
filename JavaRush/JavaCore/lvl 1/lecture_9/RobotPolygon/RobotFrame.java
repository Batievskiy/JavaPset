import javax.swing.JFrame;

public class RobotFrame extends JFrame {

    public RobotFrame(Robot robot) {
        // set the title of the Frame
        setTitle("Robot Polygon");
        // add the Component for draw of the path lines
        add(new RobotPathComponent(robot));
        // set frame size
        setBounds(100, 100, 500, 500);
    }
}
