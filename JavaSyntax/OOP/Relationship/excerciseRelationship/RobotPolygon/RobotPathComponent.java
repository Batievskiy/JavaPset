import javax.swing.JComponent;
import java.awt.Graphics;

public class RobotPathComponent extends JComponent {

    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // traverse all the lines from Robot
        for (RobotLine robotLine : robot.getLines()) {
            int x1 = (int) Math.round(robotLine.getX1());
            int y1 = (int) Math.round(robotLine.getY1());
            int x2 = (int) Math.round(robotLine.getX2());
            int y2 = (int) Math.round(robotLine.getY2());
            // and draw the line
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
