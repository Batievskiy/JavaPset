// what is TimeUnit in Java?
// let's find out

import java.util.concurrent.TimeUnit;

public class TimeUnitClassPart2 implements Runnable {

    /* as Thread.sleep() - TimeUnit deals with time units
    provides time representation at given unit of granularity.
    it makes available methods to convert time across time units:
    1. Nanoseconds: One thousandth of a microsecond
    2. Microseconds: One thousandth of a millisecond
    3. Milliseconds: One thousandth of a second
    4. Seconds: One second
    5. Minutes: Sixty seconds
    6. Hours: Sixty minutes
    7. Days: Twenty four hours */
    public void run() {

        // let's get array of TimeUnit enum constants using values()
        for (TimeUnit unit : TimeUnit.values()) {
            try {
                // 1 second pause
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println(unit + " : "
                    + unit.convert(24, TimeUnit.HOURS));
        }
    }

    public static void main(String[] args) {
        TimeUnitClassPart2 object = new TimeUnitClassPart2();
        System.out.println("---< Time example >---");

        // create a start Thread
        Thread thread1 = new Thread(object);
        thread1.start();

        System.out.println("Thread is gonna run for 5 seconds");
        try {
            TimeUnit.SECONDS.timedJoin(thread1, 5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Thread Execution Paused!");
        System.out.println("Resume...");
    }
}
