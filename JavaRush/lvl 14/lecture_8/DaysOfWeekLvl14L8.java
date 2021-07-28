public class DaysOfWeekLvl14L8 {


    public static void main(String[] args) {
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        System.out.println(monday);

        // .ordinal() - returns index of constant
        Integer sundayNumber = DaysOfWeek.SUNDAY.ordinal();
        System.out.println(sundayNumber);

        // .valueOf() - returns object by its name
        DaysOfWeek friday = DaysOfWeek.valueOf("FRIDAY");
        System.out.println(friday);
    }


}

enum DaysOfWeek {
    SUNDAY ("SUNDAY"),
    MONDAY ("MONDAY"),
    TUESDAY ("TUESDAY"),
    WEDNESDAY ("WEDNESDAY"),
    THURSDAY ("THURSDAY"),
    FRIDAY ("FRIDAY"),
    SATURDAY ("SATURDAY");

    public final String title;

    private DaysOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
