// what is Thread.sleep() in Java?
// let's find out

import java.lang.Thread;

// if want to switch to another thread
public class ThreadSleep {
    public static void main(String[] args) {
        SleepRunnable sleepRunnable = new SleepRunnable();

        Thread one = new Thread(sleepRunnable);
        one.setName("one");
        Thread two = new Thread(sleepRunnable);
        two.setName("two");
        Thread three = new Thread(sleepRunnable);
        three.setName("three");

        one.start();
        two.start();
        three.start();
    }
}

class SleepRunnable implements Runnable {
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", i is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
