// create method getDofWeek(LocalDate date) to
// return english name of date argument
// use getDayOfWeek() and getDisplayName()
// with parameters such as (TextStyle.FULL, Locale.forLanguageTag("en"))

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class SolutionLvl17L4v1 {
    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDofWeek(birthDate));
    }

    public static String getDofWeek(LocalDate date) {
        String result;
        result = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("en"));
        return result;
    }
}
