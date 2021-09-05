import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.time.ZoneId;

public class LocalDateClassFormat {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Vienna");
        LocalDate today = LocalDate.now(zoneId);
        System.out.println("LocalDate.now() -> " + today);

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("dd MMMM, yyyy");

        System.out.println("dateTimeFormatter.format() -> " +
                dateTimeFormatter.format(today));

        String fDate = LocalDate
                .now(zoneId)
                .format(DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.FULL)
                        .withLocale(Locale.UK));
        System.out.println("formattedDate -> " + fDate);
    }
}
