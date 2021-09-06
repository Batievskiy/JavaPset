// check for while-loop - it has to iterate four times
// and print out four lines
// change amazingMethod() only

import java.time.LocalTime;

public class SolutionLvl17L5v1 {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        System.out.println(localTime);
        LocalTime next = amazingMethod(localTime);

        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    public static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(6); // change from 3 to 6 hours to add

    }
}
