import java.util.Arrays;

public class MonthLvl14L8 {
    public static void main(String[] args) {
        HolidayReminder reminder = new HolidayReminder();
        reminder.printHolidays(Month.JANUARY);

        System.out.println(Arrays.toString(Month.getSummerMonths()));

        
    }
}

enum Month {
    JANUARY("JANUARY", 31),
    FEBRUARY("FEBRUARY", 28),
    MARCH("MARCH", 31),
    APRIL("APRIL", 30),
    MAY("MAY", 31),
    JUNE("JUNE", 30),
    JULY("JULY", 31),
    AUGUST("AUGUST", 31),
    SEPTEMBER("SEPTEMBER", 30),
    OCTOBER("OCTOBER", 31),
    NOVEMBER("NOVEMBER", 30),
    DECEMBER("DECEMBER", 31);

    private String name;
    private int daysCount;

    Month(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }

    public static Month[] getWinterMonths() {
        return new Month[] {DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSummerMonths() {
        return new Month[] {JUNE, JULY, AUGUST};
    }

    public static Month[] getSpringMonths() {
        return new Month[] {MARCH, APRIL, MAY};
    }

    public static Month[] getAutumnMonths() {
        return new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount() {
        this.daysCount = daysCount;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }
}

class HolidayReminder {
    public void printHolidays(Month month) {
        switch (month) {
            case JANUARY -> System.out.println("7th of January - Christmas");
            case FEBRUARY -> System.out.println("22th of February - Halloween");
            case MARCH -> System.out.println("24th of March - birthday");
        }
    }
}