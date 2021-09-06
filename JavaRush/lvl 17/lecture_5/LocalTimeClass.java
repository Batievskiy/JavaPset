import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {

        // creating current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("LocalTime.now() -> " + currentTime);

        // creating particular time
        // you can pass hours, minutes as minimum amount of arguments
        LocalTime particularTime = LocalTime.of(12, 5, 0, 100);
        System.out.println("LocalTime.of() -> " + particularTime);

        // time using number of day second
        LocalTime secondsTime = LocalTime.ofSecondOfDay(2600);
        System.out.println("LocalTime.ofSecondOfDay() -> " + secondsTime);
    }
}
