// JavaRush lvl 12 lecture 3 problem
// correct program
public class SolutionLvl12L3v2 {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width) {
        this.height = height; // <--- don't forget to use this.
        this.width = width;
    }

    public void printSize() {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
