// strange JavaRush problem
// implement swap() method
// you only can use XOR
public class PairSwapXOR {
    private int x;
    private int y;

    public PairSwapXOR(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }
}