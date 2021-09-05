// create four methods
// nowExample() - has to return current date
// ofExample() - has to return Sep 12 2020 using LocalDate.of() method
// ofYearDayExample() - has to return Sep 12 2020 using LocalDate.ofYearDay() method
// ofEpochDayExample() - has to return Sep 12 2020 using LocalDate.ofEpochDay

import java.time.LocalDate;

public class SolutionLvl17L4v0 {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    public static LocalDate nowExample() {
        return LocalDate.now();
    }

    public static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    public static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(2020, 256);
    }

    public static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(18517);
    }
}
