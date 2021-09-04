import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SimpleDateFormatClass {

    public static void main(String[] args) {
        Date currentDate = new Date(105, Calendar.JUNE, 4, 12, 15, 0);
        SimpleDateFormat formattedDate = new SimpleDateFormat("MMM-dd-yyyy", Locale.US);
        String message = formattedDate.format(currentDate);
        System.out.println(message);

        Date parsedDate = new Date();
        parsedDate.setTime(Date.parse("Jul 06 12:15:00 2019"));
        System.out.println("Date.parse() -> " + parsedDate);
    }
}
