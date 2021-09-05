import java.time.LocalDate;

public class LocalDateOfClass {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1999, 1,1);
        System.out.println("LocalDate.of(1999, 1, 1) -> " + localDate);

        LocalDate dateOfYearDay = LocalDate.ofYearDay(2077, 1);
        System.out.println("LocalDate.ofYearDay(2077, 1) -> " + dateOfYearDay);

        LocalDate unixDate = LocalDate.ofEpochDay(1);
        System.out.println("LocalDate.ofEpochDay(1) -> " + unixDate);
    }
}
