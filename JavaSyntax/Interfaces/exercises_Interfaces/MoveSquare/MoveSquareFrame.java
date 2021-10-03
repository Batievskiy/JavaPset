import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MoveSquareFrame extends JFrame {
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";

    public MoveSquareFrame() {
        SquareComponent squareComponent = new SquareComponent();
        // add the component to draw the square
        add(squareComponent);

        // create the button to move the square UP
        JButton btnUp = new JButton(UP);
        // set an identifier to know this command
        btnUp.setActionCommand(UP);
        // add the listener to the buttonUp
        btnUp.addActionListener(squareComponent);
        // place the button on top of the frame
        add(btnUp, BorderLayout.NORTH);

        // create the button to move the square DOWN
        JButton btnDown = new JButton(DOWN);
        // set the identifier to know this command
        btnDown.setActionCommand(DOWN);
        // add the listener to the button
        btnDown.addActionListener(squareComponent);
        // place the button on bottom of the frame
        add(btnDown, BorderLayout.SOUTH);

        // set the coordinates
        setBounds(100, 100, 400, 400);
    }
}
