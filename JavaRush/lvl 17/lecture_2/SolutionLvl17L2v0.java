// initialize a variable birthDate with a n object Date
// create getDayOfWeek(Date date) in other language

import java.util.Date;
import java.util.Calendar;

public class SolutionLvl17L2v0 {

    static Date birthDate = new Date(86, Calendar.MARCH, 3);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    public static String getDayOfWeek(Date date) {
        String translated = "";
        int day = date.getDay();
        return switch(day) {
            case 0 -> "воскресенье";
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            default -> "";
        };
    }
}
