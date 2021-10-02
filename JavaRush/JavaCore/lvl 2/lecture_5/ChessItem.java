public abstract class ChessItem {
    public int x, y;
    private int value;

    public int getValue() {
        return value;
    }

    public abstract void draw();
}
