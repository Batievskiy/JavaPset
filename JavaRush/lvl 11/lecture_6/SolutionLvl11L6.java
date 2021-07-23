// JavaRush lvl 11 lecture 6 problem
// correct program

import java.util.Calendar;

public class SolutionLvl11L6 {
    private final int currentYear;

    public SolutionLvl11L6() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        SolutionLvl11L6 solutionLvl11L6 = new SolutionLvl11L6();
        System.out.println(solutionLvl11L6.getCurrentYear());
    }
}
