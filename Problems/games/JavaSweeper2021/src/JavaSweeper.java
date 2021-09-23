import javax.swing.JFrame; // to run the program in the window
import javax.swing.WindowConstants; // to set auto close of the program
import javax.swing.JPanel; // to add a panel to draw on it
import java.awt.Dimension; // to set a size of the panel
import java.awt.Image; // to create Image Object
import java.awt.Graphics; // to draw the images
import javax.swing.ImageIcon; // to create icon from image file

import sweeper.Box; // to set all images
import sweeper.Coord; // to set coordinates
import sweeper.Ranges; // to set different ranges (sizes)
import sweeper.Game; // to lead all the parts of the program


// To run the program in the window
// - use 'extends JFrame'
public class JavaSweeper extends JFrame {
    // add the variable Game
    private Game game;

    // add the panel to draw on it
    private JPanel panel;
    // add constants of the size
    private final int COLS = 9;
    private final int ROWS = 9;
    private final int BOMBS = 10;
    private final int IMAGE_SIZE = 50;

    public static void main(String[] args) {
        // creating instance of main program:
        new JavaSweeper();
    }

    private JavaSweeper() {
        game = new Game(COLS, ROWS, BOMBS);
        game.start();
        setImages();
        initPanel();
        initFrame();
    }

    // adding the method to draw the panel
    private void initPanel() {
        // creating an instance of the panel
        panel = new JPanel() {
            // draw image
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                for (Coord coord : Ranges.getAllCoords()) {
                    graphics.drawImage((Image) game.getBox(coord).image,
                            coord.x * IMAGE_SIZE, coord.y * IMAGE_SIZE, this);
                }
            }
        };
        // defining size of the panel by creating new Dimension object
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x * IMAGE_SIZE,
                Ranges.getSize().y * IMAGE_SIZE));
        // and add panel into Frame
        add(panel);
    }


    private void initFrame() {
        // set auto close of the program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // set title of the program
        setTitle("Пашик-Сапер :)");
        // set title align to the center
        setLocationRelativeTo(null);
        // set non-resizable window
        setResizable(false);
        // make frame visible
        setVisible(true);
        // change the form size to pack all staff in:
        pack();
    }

    // set images
    private void setImages() {
        for (Box box : Box.values()) {
            // for all elements of the box - set image
            box.image = getImage(box.name().toLowerCase());
        }
    }

    // method to get images
    private Image getImage(String name) {
        // define name of the file
        String fileName = "img/" + name + ".png";
        // create the object of the Image from this sile
        ImageIcon icon = new ImageIcon(getClass().getResource(fileName));
        return icon.getImage();
    }
}

