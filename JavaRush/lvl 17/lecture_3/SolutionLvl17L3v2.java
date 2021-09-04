// fix the problem
// for loop have to finish in 31 iterations

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SolutionLvl17L3v2 {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.println("Start");
        while (start.before(end)) {
//            start.roll(Calendar.DATE, 1); // roll() only changes particular value but not the date
            start.add(Calendar.DATE, 1); // need to use add() to change whole date
            System.out.println(start.getTime());
        }
        System.out.println("finish");
    }
}
