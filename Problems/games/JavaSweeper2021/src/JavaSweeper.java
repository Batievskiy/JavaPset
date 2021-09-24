import javax.swing.JFrame; // to run the program in the window
import javax.swing.WindowConstants; // to set auto close of the program
import javax.swing.JPanel; // to add a panel to draw on it
import javax.swing.JLabel; // to show Label of the gameState on the screen
import java.awt.BorderLayout; // to place Label on the SOUTH
import java.awt.Dimension; // to set a size of the panel
import java.awt.Image; // to create Image Object
import java.awt.Graphics; // to draw the images
import javax.swing.ImageIcon; // to create icon from image file

import java.awt.event.MouseAdapter; // to connect mouse to MouseListener
import java.awt.event.MouseEvent; // to listen for mouse events (MousePressed)

import sweeper.Box; // to set all images
import sweeper.Coord; // to set coordinates
import sweeper.Ranges; // to set different ranges (sizes)
import sweeper.Game; // to lead all the parts of the program


// - https://www.youtube.com/watch?v=shM-eFH9aGw


// To run the program in the window
// - use 'extends JFrame'
public class JavaSweeper extends JFrame {
    // add the variable Game
    private Game game;

    // add the panel to draw on it
    private JPanel panel;
    // add the Label into the screen
    private JLabel label;

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
        initLabel();
        initPanel();
        initFrame();
    }

    // initialize Label
    private void initLabel() {
        label = new JLabel("Пашик - готовься!");
        add(label, BorderLayout.SOUTH);
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

        // adding mouse controller
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // get coordinates of mouse click
                int x = e.getX() / IMAGE_SIZE;
                int y = e.getY() / IMAGE_SIZE;
                // save them into Coord object
                Coord coord = new Coord(x, y);
                // check if left button pressed
                if (e.getButton() == MouseEvent.BUTTON1) {
                    game.pressLeftButton(coord);
                }
                if (e.getButton() == MouseEvent.BUTTON3) {
                    game.pressRightButton(coord);
                }
                if (e.getButton() == MouseEvent.BUTTON2) {
                    game.start();
                }
                label.setText(getMessage());
                // redraw frame after left button click
                panel.repaint();
            }
        });

        // defining size of the panel by creating new Dimension object
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x * IMAGE_SIZE,
                Ranges.getSize().y * IMAGE_SIZE));
        // and add panel into Frame
        add(panel);
    }

    private String getMessage() {
        return switch (game.getState()) {
            case PLAYED -> "Пашик включает свой МЕГА-МОЗГ :)";
            case BOMBED -> "Тебе оторвало ногу. Я в тебя ВЕРЮ.)))";
            case WINNER -> "Молодец. Пойди купи себе ШОКОЛАДКУ ;)";
            default -> "Пашик. Ну ты ЗАДРОТ!";
        };
    }


    private void initFrame() {
        // set auto close of the program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // set title of the program
        setTitle("Пашик-Сапер :)");
        // set non-resizable window
        setResizable(false);
        // make frame visible
        setVisible(true);
        // change the form size to pack all staff in:
        pack();
        // set title align to the center
        setLocationRelativeTo(null);
        // set icon of the program at the beginning of the title
        setIconImage(getImage("icon"));
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

