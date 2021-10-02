import java.awt.Graphics;

public class RectangleComponent extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
