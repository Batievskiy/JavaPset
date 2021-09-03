import java.util.Calendar;
import java.util.Date;

public class DateFragmentsSetters {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("currentDate -> " + currentDate);

        // .setYear() - changes year of Date object
        currentDate.setYear(1);
        System.out.println("setYear() -> " + currentDate.getYear());

        // .setMonth() - changes month of Date object
        currentDate.setMonth(Calendar.MAY);
        System.out.println("setMonth() -> " + currentDate.getMonth());

        // .setDate() - changes day of Date object
        currentDate.setDate(1);
        System.out.println("setDate() -> " + currentDate.getDay());

        // .setHours() - changes hours of Date object
        currentDate.setHours(22);
        System.out.println("setHours() -> " + currentDate);

        // .setMinutes() - changes minutes of Date object
        currentDate.setMinutes(45);
        System.out.println("setMinutes() -> " + currentDate);

        // .setSeconds() - changes seconds of Date object
        currentDate.setSeconds(7);
        System.out.println("setSeconds() -> " + currentDate);
    }
}
