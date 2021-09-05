import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateClassPlusMinus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy");
        String dateString = dateFormatter.format(localDate);
        System.out.println("format() -> " + dateString);

        System.out.println("plusDays() -> " +
                dateFormatter.format(localDate.plusDays(10)));

        System.out.println("plusWeeks() -> " +
                dateFormatter.format(localDate.plusWeeks(1)));

        System.out.println("plusMonths() -> " +
                dateFormatter.format(localDate.plusMonths(1)));

        System.out.println("plusYears() -> " +
                dateFormatter.format(localDate.plusYears(1)));

        // same with:
        System.out.println("minus.Days() -> " + localDate.minusDays(10));
        System.out.println("minusWeeks() -> " + localDate.minusWeeks(3));
        System.out.println("minusMonths() -> " + localDate.minusMonths(5));
        System.out.println("minusYears() -> " + localDate.minusYears(33));

        LocalDate currentBirthday = LocalDate.of(2021, 3, 24);
        System.out.println("birthDate -> " + currentBirthday);
        LocalDate nextBirthday = currentBirthday.plusYears(70);
        System.out.println("plusYears() -> " + nextBirthday);
        LocalDate originalBirthday = currentBirthday.minusYears(35);
        System.out.println("minusYears() -> " + originalBirthday);

    }
}
