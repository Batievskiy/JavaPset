import java.util.*;

public class EnumLvl14L8 {
    public static void main(String[] args) {

        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday);

        // .values() - returns array with all values in Enum
        System.out.println(Arrays.toString(DayOfWeek.values()));

        // .ordinal() - returns index of constant of Enum
        int mondayIndex = DayOfWeek.MONDAY.ordinal();
        System.out.println(mondayIndex);

        // .valueOf() - returns object Enum name of
        DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
    }

}

enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

class ScholarSchedule {

    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

class Scholar {

    private ScholarSchedule schedule;
    private boolean goToSchool;

    public void wakeUp() {
        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Yeah! I may sleep more :)");
        } else {
            System.out.println("No! I have to study :(");
        }
    }
}

class VeryStrictDiet {
    public void takeLunch(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY -> System.out.println("Sunday dinner :)");
            case MONDAY -> System.out.println("Monday dinner :/");
            case TUESDAY -> System.out.println("TUESDAY dinner :D");
        }
    }
}