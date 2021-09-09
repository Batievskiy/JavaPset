// in main method print out localDateTime variable in such format:
// 19.03.2020 year. 5 hours 4 minutes

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SolutionLvl17L8v0 {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd.MM.yyyy 'year.' H 'hours' m 'minutes'");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
