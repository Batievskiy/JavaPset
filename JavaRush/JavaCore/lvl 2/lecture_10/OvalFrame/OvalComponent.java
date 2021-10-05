import javax.swing.JComponent;
import java.awt.Graphics;
public class OvalComponent extends JComponent {
    // override the method to draw component
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // use Graphics to draw an oval
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
