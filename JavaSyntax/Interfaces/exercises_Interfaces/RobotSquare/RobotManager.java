import javax.swing.JFrame;

public class RobotManager {

    public static void main(String[] args) {
        // Number of sides of a polygon
        final int COUNT = 4;
        // length of a side
        final int SIDE = 100;

        Robot robot = new Robot(200, 50);

        // set a listener for the robot
        SimpleRobotListener srListener = new SimpleRobotListener();
        robot.setListener(srListener);

        // create a closed shape with COUNT number of corners
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }

        // create the shape to draw a path of the Robot
        RobotSquareFrame robotFrame = new RobotSquareFrame(robot);
        robotFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        robotFrame.setVisible(true);
    }
}
