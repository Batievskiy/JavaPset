import javax.swing.JFrame;

public class OvalApplication {
    public static void main(String[] args) {
        // create graphic frame
        OvalFrame of = new OvalFrame();
        // set the rule to close frame
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create the frame visible
        of.setVisible(true);
    }
}
