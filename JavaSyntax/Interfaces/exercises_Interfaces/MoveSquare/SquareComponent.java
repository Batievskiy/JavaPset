import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class SquareComponent extends JComponent implements ActionListener {

    // define the constant of a square side size
    private static final int SQUARE_SIZE = 30;
    // define the constant to a moving step
    private static final int STEP = 10;
    // define a field to store current square's coordinates
    private int x = 0;
    private int y = 0;

    @Override
    public void actionPerformed(ActionEvent event) {
        // the input parameter contains a reference
        // to the person who sent the message.
        // Get the object by calling getSource.
        // Using the word instanceof we can check
        // that the object belongs to the JButton class.
        if (event.getSource() instanceof JButton) {
            // cast the JButton class to the object
            JButton button = (JButton) event.getSource();

            // compare the command with the UP string
            if (MoveSquareFrame.UP.equals(button.getActionCommand())) {
                y -= STEP;
            }

            // compare the command with the DOWN string
            if (MoveSquareFrame.DOWN.equals(button.getActionCommand())) {
                y += STEP;
            }

            // repaint the component
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
    }
}
