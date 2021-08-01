// JavaRush lvl 15 lecture 6

public class StackTraceJRLvl15L6 {
    public static void main(String[] args) {

        // to get stack trace we do:
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();

        // or:
        Thread current = Thread.currentThread();
        StackTraceElement[] methods2 = current.getStackTrace();

        test();

    }

    public static void test() {
        Thread currentThread = Thread.currentThread();
        StackTraceElement[] stackTraceElements = currentThread.getStackTrace();

        for (var info : stackTraceElements) {
            System.out.println(info);
        }
    }
}
