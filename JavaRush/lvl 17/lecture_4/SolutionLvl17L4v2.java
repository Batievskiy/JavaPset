// fix the program

import java.time.LocalDate;

public class SolutionLvl17L4v2 {
    public static void main(String[] args) {
        LocalDate jubilee40Years = LocalDate
                .of(/* - */2010, 3, 13); // negative year is incorrect
        LocalDate jubilee30Years = jubilee40Years.minusYears(10);

        System.out.println(jubilee30Years.getYear());
    }
}
