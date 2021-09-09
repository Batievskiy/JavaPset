import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterParsing {
    public static void main(String[] args) {
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
//                .ofPattern("MMMM dd, yyyy")
//                .withLocale(Locale.forLanguageTag("en"));
//        LocalDate localDate = LocalDate.parse("February-23-2021", dateTimeFormatter);
//        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("MMMM dd, yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse("February 23, 2021", dateTimeFormatter);
        System.out.println(dateTimeFormatter.format(localDate));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("23:59:59");
        System.out.println(time);
    }
}
