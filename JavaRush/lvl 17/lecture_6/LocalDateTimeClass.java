import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeClass {
    public static void main(String[] args) {

        // current date
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("LocalDateTime.now() -> " + currentDate);

        // particular date
        LocalDateTime particularTime = LocalDateTime
                .of(1999, Month.MARCH, 22, 45, 15, 35, 11);

        // .of(LocalDate date, LocalTime time)
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime ofLocalDateLocalTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime.of(LocalDate, localTime) -> " + ofLocalDateLocalTime);
    }
}
