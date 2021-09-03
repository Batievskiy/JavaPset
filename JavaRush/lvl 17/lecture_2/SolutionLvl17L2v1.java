// change fixDate() method
// 1. if date is greater than current date -> fix year and month
// (using setYear() and setMonth() methods)
// 2. if date is less than current date -> there is nothing to fix
// method fixDate() has to fix all brokenDates
// year starts from 1900
// month starts from 0

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class SolutionLvl17L2v1 {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date());
        dateList.add(new Date());
        dateList.add(new Date());
        dateList.add(new Date());

        System.out.println("before fixes: ");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    public static void fixDate(List<Date> brokenDates) {
        Date current = new Date();
        for (Date brokenDate : brokenDates) {
            if (brokenDate.after(current)) {
                brokenDate.setYear(brokenDate.getYear() - 1900);
                brokenDate.setMonth(brokenDate.getMonth() - 1);
            }
        }
    }
}
