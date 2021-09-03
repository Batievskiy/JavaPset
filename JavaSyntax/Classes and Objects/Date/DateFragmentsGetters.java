import java.util.Date;
import java.util.Calendar;

public class DateFragmentsGetters {
    public static void main(String[] args) {

        // Date class is Deprecated from JDK 1.1
        // replaced by Calendar
        Date currentDate = new Date();
        Date current = Calendar.getInstance().getTime();
        System.out.println("currentDate -> " + currentDate);
        System.out.println("currentCalendar -> " + current);

        // .getYear() - returns year from Date object
        int currentYear = currentDate.getYear();
        System.out.println("getYear() - > " + currentYear);

        // .getMonth() - return month from Date object
        int currentMonth = currentDate.getMonth();
        System.out.println("getMonth() -> " + currentMonth);

        // .getDate() - returns day of month from Date object
        int monthDay = currentDate.getDate();
        System.out.println("getDate() -> " + monthDay);

        // .getHours() - returns hours from Date object
        int currentHours = currentDate.getHours();
        System.out.println("getHours() -> " + currentHours);

        // .getMinutes() - returns minutes from Date object
        int currentMinutes = currentDate.getMinutes();
        System.out.println("getMinutes() -> " + currentMinutes);

        // .getSeconds() - returns seconds from Date object
        int currentSeconds = currentDate.getSeconds();
        System.out.println("getSeconds() -> " + currentSeconds);

        // .getTime() - returns milliseconds from Date object
        long timeMils = currentDate.getTime();
        System.out.println("getTime() -> " + timeMils);
    }
}
