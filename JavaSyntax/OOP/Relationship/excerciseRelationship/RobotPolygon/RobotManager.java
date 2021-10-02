import javax.swing.JFrame;

public class RobotManager {

    public static void main(String[] args) {
        // Number of sides of a Polygon
        final int COUNT = 8;
        // side length
        final int SIDE = 139;

        Robot robot = new Robot(200, 50);

        // create a close shape
        for (int i = 0; i < COUNT; i++) {
            robot.moveForward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }

        // create a shape for drawing a path of the robot
        RobotFrame robotFrame = new RobotFrame(robot);
        robotFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        robotFrame.setVisible(true);
    }
}
