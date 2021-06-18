// primitive JavaRush problem
// use all time units in setTimer method in .sleep

import java.util.concurrent.TimeUnit;


public class TimeOut {
    public static void main(String[] args) throws InterruptedException {
        setTimer(1,6,15,35,500);
    }

    private static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Timer is set!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("La-la-la-la-la...");
    }
}
