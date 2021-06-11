// what is Thread.sleep() in Java?
// let's find out

import java.lang.Thread;

public class MainThreadSleepMethod {

    // it's present in java.lang package
    // The .sleep() method is used to stop the execution of the current thread
    // for specific duration of the time

    // let's count from 3 to 0 - and launch a rocket
    // BUT! whe have to catch `InterruptedException`
    public static void main(String[] args) {
        System.out.println("---< Rocket launcher >---");
        try {
            for (int counter = 3; counter > 0; counter--) {

                // sleep 1 second each loop circle
                Thread.sleep(1000); // 1 second

                // print counter
                System.out.println(counter);
            }
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace(); // another way to print

        }
        System.out.println("Launch! ---> *");
    }
}
