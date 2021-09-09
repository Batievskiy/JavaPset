// Initialize a static variable dateTimeFormatter
// think of a pattern to parse string timeString
// in main method create LocalDateTime
// using string timeString and pattern DateTimeFormatter

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class SolutionLvl17L8v2 {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("H:m:s dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);


        System.out.println(dateTimeFormatter.format(dateTime));

        LocalDate localDate = LocalDate.of(20, 2, 1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM, dd, yyyy");
        System.out.println(dtf.format(localDate));
    }
}
