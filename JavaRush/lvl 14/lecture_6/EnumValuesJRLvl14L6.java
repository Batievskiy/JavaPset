// JavaRush lvl 14 lecture 6

// some enum methods

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // custom method:
    public static List<Day> asList() {
        ArrayList<Day> list = new ArrayList<>();

        Collections.addAll(list, values());

        return list;
    }
}

public class EnumValuesJRLvl14L6 {
    public static void main(String[] args) {

        // .values() - returns an array of values of the enum
        Day[] days = Day.values();
        // and printing them out
        for (Day day : days) {
            System.out.println(day);
        }

        // .ordinal() - returns number of constant
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(Day.WEDNESDAY.ordinal());

        // .toString()
        String monday = Day.MONDAY.toString();
        String wednesday = Day.WEDNESDAY.toString();
        String sunday = Day.SUNDAY.toString();

        // using .ordinal() to store numbers
        int indexMonday = Day.MONDAY.ordinal();
        int indexSunday = Day.SUNDAY.ordinal();
        int indexFriday = Day.FRIDAY.ordinal();

        // backwards conversion using .values()[index]
        Day day = Day.values()[2];

        // custom methods:
        List<Day> list = Day.asList();
        System.out.println(list);
    }
}
