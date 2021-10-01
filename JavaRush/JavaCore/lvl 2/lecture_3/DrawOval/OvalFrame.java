import javax.swing.JFrame;

public class OvalFrame extends JFrame {
    public OvalFrame() {
        // create an object type OvalComponent
        OvalComponent oc = new OvalComponent();

        // using the method of the class JFrame
        // to add a component on main panel
        add(oc);

        // set coordinates and size of the frame
        setBounds(200, 200, 300, 250);
    }
}
