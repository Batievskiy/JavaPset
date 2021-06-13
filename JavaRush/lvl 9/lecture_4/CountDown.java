// primitive JavaRush problem
// create Count Down timer to launch Rocket :)
public class CountDown {
    private static final int N = 3;
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    private static void countDown() throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch! ---> *");
    }
}
