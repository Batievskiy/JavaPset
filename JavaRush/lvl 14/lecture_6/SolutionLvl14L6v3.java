// create getNextMonth method
// if current month is December - > return January
// if not - > return next month

public class SolutionLvl14L6v3 {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int next;
        if (month == Month.DECEMBER) {
            next = 0;
        } else {
            next = month.ordinal() + 1;
        }
        return Month.values()[next];
    }

    // other way
//    public static Month getNextMonth(Month month) {
//        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
//        return Month.values()[ordinal];
//    }
}

enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}