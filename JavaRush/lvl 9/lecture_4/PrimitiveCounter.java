// JavaRush primitive problem
// create counter that counts from 1 to 10
// with pauses of 1.3 milliseconds
// but with 9 pauses
public class PrimitiveCounter {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }
    }
}
