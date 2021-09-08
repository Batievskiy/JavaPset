import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Month;
import java.time.DayOfWeek;

public class ZonedDateTimeGetters {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("zoneDateTime -> " + zonedDateTime);

        int year = zonedDateTime.getYear();
        System.out.println(".getYear() -> " + zonedDateTime.getYear());

        Month month = zonedDateTime.getMonth();
        System.out.println(".getMonth() -> " + zonedDateTime.getMonth());

        int monthNumber = zonedDateTime.getMonthValue();
        System.out.println(".getMonthValue() -> " + zonedDateTime.getMonthValue());

        int day = zonedDateTime.getDayOfMonth();
        System.out.println(".getDayOfMonth() -> " + zonedDateTime.getDayOfMonth());

        DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();
        System.out.println(".getDayOfWeek() -> " + zonedDateTime.getDayOfWeek());

        int dayOfYear = zonedDateTime.getDayOfYear();
        System.out.println(".getDayOfYear() -> " + zonedDateTime.getDayOfYear());

        int hour = zonedDateTime.getHour();
        System.out.println(".getHour() -> " + zonedDateTime.getHour());

        int minute = zonedDateTime.getMinute();
        System.out.println(".getMinute() -> " + zonedDateTime.getMinute());

        int second = zonedDateTime.getSecond();
        System.out.println(".getSecond() -> " + zonedDateTime.getSecond());

        int nano = zonedDateTime.getNano();
        System.out.println(".getNano() -> " + zonedDateTime.getNano());
    }
}
