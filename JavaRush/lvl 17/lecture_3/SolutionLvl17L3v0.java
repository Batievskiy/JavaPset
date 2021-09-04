// initialize birthDate with your day of birth
// create method getDayOfWeek(Calendar calendar)
// - to return name of day of calendar argument
// remember that Saturday is 0th index

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SolutionLvl17L3v0 {

    static Calendar birthDate = new GregorianCalendar(
            1986, Calendar.MARCH, 24);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    public static String getDayOfWeek(Calendar calendar) {
        int d = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(d);
        return switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "saturday";
            case 2 -> "monday";
            case 3 -> "tuesday";
            case 4 -> "wednesday";
            case 5 -> "thursday";
            case 6 -> "friday";
            case 7 -> "sunday";
            default -> "unknown";
        };
    }
}
