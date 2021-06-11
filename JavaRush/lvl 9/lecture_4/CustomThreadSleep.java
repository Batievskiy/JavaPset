// Java program using custom thread sleep
// what is Thread.sleep() in Java?
// let's find out

import java.lang.Thread;

public class CustomThreadSleep extends Thread {

    // it's present in java.lang package
    // The .sleep() method is used to stop the execution of the current thread
    // for specific duration of the time

    // let's count from 3 to 0 - and launch a rocket
    // BUT! whe have to catch `InterruptedException`
    public void run() {
        // thread 0

        try {
            for (int i = 3; i > 0; i--) {

                // sleep for 1 second each loop circle
                Thread.sleep(1000);
                // if argument be negative value (-1000)
                // this will throw the `IllegalArgumentException`

                // this Thread.sleep() method will sleep the thread 0
                System.out.println(i);
            }
            Thread.sleep(1000);
        } catch (Exception ex) {
            //catching the exception
            System.out.println(ex);
            ex.printStackTrace(); // another way to print
        }
    }
    public static void main(String[] args) {
        // main thread
        System.out.println("---< Rocket launcher >---");
        CustomThreadSleep object = new CustomThreadSleep();
        object.start();
        System.out.println("Launch! ---> *");
    }

}
