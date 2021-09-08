import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalTime;

public class ZonedDateTimeClass {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime.now() -> " + ZonedDateTime.now());

        // to print all 559 zones:
//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        ZoneId europeAthensZoneId = ZoneId.of("Europe/Athens");
        System.out.println("ZoneId.of(\"Europe/Athens\") -> " + europeAthensZoneId);

        ZonedDateTime europeAthens = ZonedDateTime.now(europeAthensZoneId);
        System.out.println(europeAthens);

        ZoneId zone = ZoneId.of("Africa/Cario");
        ZonedDateTime carioTime = ZonedDateTime.now(zone);

        // to convert ZonedDateTime into a LocalDate or LocalTime use:
        // .toLocalDate()
        // .toLocalTime()
        LocalDate localDate = carioTime.toLocalDate();
        LocalTime localTime = carioTime.toLocalTime();
    }
}
