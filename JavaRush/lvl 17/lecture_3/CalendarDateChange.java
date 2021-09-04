import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDateChange {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("current calendar\t\t: " + calendar.getTime());

        // we can change whole date using Calendar.add() method
        // (adding positive or negative values to year, day, month etc.)
        calendar.add(Calendar.MONTH, 1);
        System.out.println("add(Calendar.MONTH, 1)\t\t: " + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("add(Calendar.DAY_OF_MONTH, 10)\t: " + calendar.getTime());

        calendar.add(Calendar.HOUR, -700);
        System.out.println("add(Calendar.HOUR, -700)\t: " + calendar.getTime());

        // or roll date only particular values using Calendar.roll() method
        calendar.roll(Calendar.YEAR, 11);
        System.out.println("roll.Calendar.YEAR, 11)\t\t: " + calendar.getTime());

    }
}
