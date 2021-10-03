import javax.swing.JFrame;

public class MoveSquare {
    public static void main(String[] args) {
        // create the graphic frame
        MoveSquareFrame msFrame = new MoveSquareFrame();
        // set the rule to close the frame
        msFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the frame visible
        msFrame.setVisible(true);
    }
}
