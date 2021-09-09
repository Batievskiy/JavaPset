/* print out a variable zonedDateTime in such pattern:
   4 9.3.19 06:03:07.319180500 Europe/Kiev
   where:
   4 - day of week
   9 - day of month
   3 - month
   19 - year
   06 - hours
   03 - minutes
   07 - seconds
   319180500 - nanoseconds
*/

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SolutionLvl17L8v1 {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("e d.M.yy HH:mm:ss.n VV");

        System.out.println(dateTimeFormatter.format(zonedDateTime));
    }
}
