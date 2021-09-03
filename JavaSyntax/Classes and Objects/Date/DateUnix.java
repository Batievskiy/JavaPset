import java.util.Calendar;
import java.util.Date;

public class DateUnix {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("current date -> " + currentDate);

        Date myBirthday = new Date(86, Calendar.MARCH, 24);
        System.out.println("My birthday - > " + myBirthday);

        Date exactDate = new Date(121, Calendar.SEPTEMBER, 3, 16, 8, 33);
        System.out.println("exactDate -> " + exactDate);
    }
}
