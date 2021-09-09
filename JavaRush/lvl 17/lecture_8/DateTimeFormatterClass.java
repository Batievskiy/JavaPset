import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterClass {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("MMM dd, yyyy")
                .withLocale(Locale.forLanguageTag("en"));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(localDateTime));

        /* formatters:
        y - year
        M - month
        d - day
        H - hour
        m - minute
        s - seconds
        S - milliseconds
        n - nanoseconds
        */
    }
}
