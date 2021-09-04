
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarSetters {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        // .set(Calendar.YEAR) - sets year
        calendar.set(Calendar.YEAR, 1999);
        System.out.println("set(YEAR) -> " + calendar.get(Calendar.YEAR));

        // .set(Calendar.MONTH) - set month
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        System.out.println("set(Calendar.MONTH, Calendar.SEPTEMBER) -> " +
                calendar.get(Calendar.MONTH));

        // .set(Calendar.DAY_OF_MONTH) - set day of month (from 1 to 31)
        calendar.set(Calendar.DAY_OF_MONTH, 17);
        System.out.println("set(Calendar.DAY_OF_MONTH, 17) -> " +
                calendar.get(Calendar.DAY_OF_MONTH));

        // .set(Calendar.HOUR_OF_DAY) - set hours
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        System.out.println("set(Calendar.HOUR_OF_DAY, 12) -> " +
                calendar.get(Calendar.HOUR_OF_DAY));

        // .set(Calendar.MINUTE) - set minutes
        calendar.set(Calendar.MINUTE, 15);
        System.out.println("set(Calendar.MINUTE) -> " +
                calendar.get(Calendar.MINUTE));

        // .SET(Calendar.SECOND) - set seconds
        calendar.set(Calendar.SECOND, 15);
        System.out.println("set(Calendar.SECOND, 15) -> " +
                calendar.get(Calendar.SECOND));

        System.out.println(calendar.getTime());
    }
}
