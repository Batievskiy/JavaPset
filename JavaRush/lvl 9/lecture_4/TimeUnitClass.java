// what is TimeUnit in Java?
// let's find out

import java.util.concurrent.TimeUnit;

public class TimeUnitClass {

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

    public static void main(String[] args) {
        long hours = 96;

        // convert hours in days
        long days = TimeUnit.DAYS.convert(hours, TimeUnit.HOURS);

        // convert days in minutes
        long minutes = TimeUnit.MINUTES.convert(days, TimeUnit.DAYS);

        System.out.println(hours + " hours = "
                + days + " days = "
                + minutes + " minutes");

        // convert minutes to microseconds
        long micros = TimeUnit.MINUTES.toMicros(minutes);
        System.out.println(minutes + " minutes = "
                + micros + " microseconds");

        // convert microseconds to seconds
        long seconds = TimeUnit.MICROSECONDS.toSeconds(micros);
        System.out.println(micros + " microseconds = "
                + seconds + " seconds");

        // create TimeUnit object of type Minutes
        TimeUnit time = TimeUnit.valueOf("MINUTES");
        System.out.println("TimeUnit object type: " + time);
    }
}
