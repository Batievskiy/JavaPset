import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarConstants {
    public static void main(String[] args) {

        // ALL CONSTANTS HERE - https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html

        int dayOfMonth = 3;
        Calendar calendar = new GregorianCalendar(2021, Calendar.SEPTEMBER, dayOfMonth);
        // from: Calendar.SATURDAY;
        // to:   Calendar.MONDAY;
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            System.out.println("this is Friday");
        } else {
            System.out.println("this is not a Friday");
        }

        // from: Calendar.JANUARY; (0)
        //       ...
        //       Calendar.DECEMBER; (11)
        // to:   UNDECIMBER; (12) - thirteen month of the year (lunar calendar)
        int month = Calendar.UNDECIMBER;
        System.out.println("Calendar.UNDECIMBER -> " + month);

        // Calendar.AM; (0)
        // Calendar.PM; (1)
        int timeStamp = Calendar.PM;
        System.out.println("Calendar.PM -> " + timeStamp);

        // Calendar.ZONE_OFFSET - raw offset from GMT in milliseconds
        int zoneOffset = Calendar.ZONE_OFFSET;
        System.out.println("Calendar.ZONE_OFFSET -> " + zoneOffset +" ms");

        // Calendar.DST_OFFSET - daylight saving offset in milliseconds
        int dstOffset = Calendar.DST_OFFSET;
        System.out.println("Calendar.DST_OFFSET -> " + dstOffset + " ms");

    }
}
