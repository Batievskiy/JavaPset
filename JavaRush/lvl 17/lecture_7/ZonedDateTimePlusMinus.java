import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimePlusMinus {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Toronto");

        ZonedDateTime time = ZonedDateTime.now(zoneId);
        System.out.println(time);

        // plus an minus from plusYears() to plusNanos()
        ZonedDateTime plusYears = time.plusYears(10);
        System.out.println(".plusYears() -> " + plusYears);

        ZonedDateTime minusMonths = time.minusMonths(10);
        System.out.println(".minusMonths() -> " + minusMonths);

        ZonedDateTime plusDays = time.plusDays(10);
        System.out.println(".plusDays() -> " + plusDays);

        ZonedDateTime minusHours = time.minusHours(10);
        System.out.println(".minusHours() -> " + minusHours);

        ZonedDateTime plusMinutes = time.plusMinutes(10);
        System.out.println(".plusMinutes() -> " + plusMinutes);

        ZonedDateTime minusSeconds = time.minusSeconds(10);
        System.out.println(".minusSeconds() -> " + minusSeconds);

        ZonedDateTime plusNanos = time.plusNanos(1000);
        System.out.println(".plusNanos() -> " + plusNanos);
    }
}
