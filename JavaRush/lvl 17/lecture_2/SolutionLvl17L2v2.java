// fix the program to print 2010-01-06
// don't change date variable initialization

import java.text.SimpleDateFormat;
import java.util.Date;

public class SolutionLvl17L2v2 {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formattedDate.format(date));
    }
}
