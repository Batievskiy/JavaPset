import java.util.Date;
import java.util.Calendar;

public class DateCompare {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date elderDate = new Date(86, Calendar.MARCH, 4);

        // compare using two getTime() methods
        if (currentDate.getTime() > elderDate.getTime()) {
            System.out.println("currentDate.getTime() > elderDate.getTime()");
        }

        // compare using before() method
        if (elderDate.before(currentDate)) {
            System.out.println("elderDate.before(currentDate) -> " + elderDate.before(currentDate));
        }

        // compare using after() method
        if (currentDate.after(elderDate)) {
            System.out.println("currentDate.after(elderDate) -> " + currentDate.after(elderDate));
        }
    }
}
