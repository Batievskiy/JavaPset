import javax.swing.JFrame;

public class OvalApplication {
    public static void main(String[] args) {
        // creating the graphical frame
        OvalFrame of = new OvalFrame();

        // We set the rule according to which
        // the application will terminate when
        // close this form.
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        of.setVisible(true);
    }
}
