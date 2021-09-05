import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.chrono.IsoEra;

public class LocalDateClassGetters {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate.now() -> " + date);

        int year = date.getYear();
        System.out.println("getYear() -> " + date.getYear());

        Month month = date.getMonth();
        System.out.println("getMonth() -> " + date.getMonth());

        int monthNumber = date.getMonthValue();
        System.out.println("getMonthValue() -> " + date.getMonthValue());

        int dayOfMonth = date.getDayOfMonth();
        System.out.println("getDayOfMonth() -> " + date.getDayOfMonth());

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("getDayOfWeek() -> " + date.getDayOfWeek());

        IsoEra era = date.getEra();
        System.out.println("getEra() -> " + date.getEra());
    }
}
