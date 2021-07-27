// how does enum likes like under the hood?
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

public class EnumClassJRLvl14L6 {

}

// under the hood:
class DayZ { // <--- class

    // list of constants:
    public static final DayZ MONDAY     = new DayZ(0);
    public static final DayZ TUESDAY    = new DayZ(1);
    public static final DayZ WEDNESDAY  = new DayZ(2);
    public static final DayZ THURSDAY   = new DayZ(3);
    public static final DayZ FRIDAY     = new DayZ(4);
    public static final DayZ SATURDAY   = new DayZ(5);
    public static final DayZ SUNDAY     = new DayZ(6);

    // Array with all values type DayZ
    private static final DayZ[] arrayZ = {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
    };

    // variable with value of particular object DayZ
    private final int valueZ;

    // private Constructor class DayZ
    // - objects class DayZ only created inside
    private DayZ (int valueZ) {
        this.valueZ = valueZ;
    }

    // returns value of particular object DayZ
    public int ordinalZ() {
        return this.valueZ;
    }

    // returns static array with all values of class DayZ
    public static DayZ[] valuesZ() {
        return arrayZ;
    }


}
