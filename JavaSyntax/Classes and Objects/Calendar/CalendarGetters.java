import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarGetters {
    public static void main(String[] args) {

        // .getInstance() - creates an object class Calendar, initialized by a current date
        Calendar calendarCurrent = Calendar.getInstance();

        /*
        GregorianCalendar
        BuddhistCalendar
        JapaneseImperialCalendar
         */

        Calendar calendar = new GregorianCalendar(
                2021, Calendar.SEPTEMBER, 4);

        // .get(Calendar.MONTH) - returns the month of calendar
        int month = calendar.get(Calendar.MONTH);
        System.out.println("get(Calendar.MONTH) -> " + calendar.get(Calendar.MONTH));

        // .get(Calendar.YEAR) - returns the year of calendar
        int year = calendar.get(Calendar.YEAR);
        System.out.println("get(Calendar.YEAR) -> " + calendar.get(Calendar.YEAR));

        // .get(Calendar.ERA) - returns the era of calendar
        int era = calendar.get(Calendar.ERA);
        System.out.println("get(Calendar.ERA) -> " + calendar.get(Calendar.ERA));

        // .get(Calendar.DAY_OF_MONTH) - return the day of month (from 1 to 31)
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("get.(Calendar.DAY_OF_MONTH) -> " + calendar.get(Calendar.DAY_OF_MONTH));

        // .get(Calendar.DAY_OF_WEEK) - returns the day of week (what? from 1 to 7)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("get(Calendar.DAY_OF_WEEK) -> " + calendar.get(Calendar.DAY_OF_WEEK));

        // .get(Calendar.HOUR) - returns the hours
        int hour = calendar.get(Calendar.HOUR);
        System.out.println("get(Calendar.HOUR) -> " + calendar.get(Calendar.HOUR));

        // .get(Calendar.MINUTE) - returns minutes
        int minute = calendar.get(Calendar.MINUTE);
        System.out.print("get(Calendar.MINUTE) -> " + calendar.get(Calendar.MINUTE));

        // .get(Calendar.SECOND) - returns seconds
        int second = calendar.get(Calendar.SECOND);
        System.out.println("get(Calendar.SECOND) -> " + calendar.get(Calendar.SECOND));
    }
}
