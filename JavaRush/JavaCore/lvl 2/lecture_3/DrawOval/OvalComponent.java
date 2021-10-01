import javax.swing.JComponent;
import java.awt.Graphics;

// inherits from standard class
// to creating shapes on the frame
public class OvalComponent extends JComponent {

    // override the method of drawing
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // drawing oval with borders
        g.drawOval(20, 20, getWidth() - 40, getHeight() - 40);
    }
}
