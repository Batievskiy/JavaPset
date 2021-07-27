// what is enum in Java?
// let's find out

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumJRLvl14L6 {
    /*
       Enumerations serve the purpose of representing a group
       of named constants in a programming language.

       example:
       the 4 suits in a deck of playing cards may be 4 enumerators
       named Club, Diamond, Heart, and Spade, belonging
       to an enumerated type named Suit
     */

    public static void main(String[] args) {
        String str1 = "MONDAY";
        TestDay test1 = new TestDay(Day.MONDAY);
        test1.dayIsLike();

    }
}

class TestDay {
    Day day;

    public TestDay(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are so-so");
        }
    }
}


