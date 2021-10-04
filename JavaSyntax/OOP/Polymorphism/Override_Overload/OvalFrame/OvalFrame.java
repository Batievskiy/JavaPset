import javax.swing.JFrame;

public class OvalFrame extends JFrame {
    public OvalFrame() {
        // create an object type OvalComponent
        OvalComponent oc = new OvalComponent();

        // use method of the class JFrame
        // to add the component onto main panel
        add(oc);

        // set the coordinates and frame size
        setBounds(200, 200, 300, 250);
    }
}
