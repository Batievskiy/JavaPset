import javax.swing.JFrame;

public class ShapeApplication {
    public static void main(String[] args) {
        // create graphical Frame
        ShapeFrame sf = new ShapeFrame();

        // set the rule to close the frame
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sf.setVisible(true);
    }
}
