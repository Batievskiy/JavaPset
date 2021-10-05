import java.awt.Graphics;

public class TriangleComponent extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawLine(5, getHeight() - 10, getWidth() / 2 - 5, 5);
        g.drawLine(getWidth() / 2 - 5, 5, getWidth() - 10, getHeight() - 10);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }
}
