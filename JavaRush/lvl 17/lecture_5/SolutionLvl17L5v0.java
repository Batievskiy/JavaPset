// initialize six static variables:
// timeMax - use maximum possible time
// timeMin - use minimal possible time
// time1 - 14:00
// time2 - 7 hours and 8 seconds
// time3 - 0 hours 45 minutes 61 nanoseconds
// time4 - 14 hours 45 seconds 1001 nanoseconds
// in main method use all times variables and print out final time

import java.time.LocalTime;

public class SolutionLvl17L5v0 {

    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 0);
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        LocalTime finalTime = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
        System.out.println(finalTime);
    }
}
