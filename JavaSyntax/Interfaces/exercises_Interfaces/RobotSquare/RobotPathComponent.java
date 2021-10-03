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
        // traverse all the lines of the Robot path
        for (RobotLine rl : robot.getLines()) {
            // get all the coordinates
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());

            // and draw the line using the coordinates
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
