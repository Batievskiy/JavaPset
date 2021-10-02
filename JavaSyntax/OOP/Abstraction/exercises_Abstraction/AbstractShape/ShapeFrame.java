import javax.swing.JFrame;
import java.awt.GridLayout;
public class ShapeFrame extends JFrame {
    public ShapeFrame() {
        // set the LayoutManager in the table 2 columns by 2 rows
        setLayout(new GridLayout(2, 3));

        // create and place all hte components onto the Frame
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());

        // set the coordinates and size of the Frame
        setBounds(200, 200, 450, 350);
    }
}
