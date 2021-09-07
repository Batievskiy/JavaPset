import java.time.LocalTime;

public class LocalTimeGetters {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("LocalTime.now() -> " + currentTime);

        int hours = currentTime.getHour();
        System.out.println(".getHour() -> " + currentTime.getHour());

        int minutes = currentTime.getMinute();
        System.out.println(".getMinute() -> " + currentTime.getMinute());

        int second = currentTime.getSecond();
        System.out.println(".getSecond() -> " + currentTime.getSecond());

        int nano = currentTime.getNano();
        System.out.println(".getNano() -> " + currentTime.getNano());
    }
}
