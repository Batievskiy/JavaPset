import java.time.LocalTime;

public class LocalTimePlusMinus {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("LocalTime.now() -> " + time);

        LocalTime plusHours = time.plusHours(10);
        System.out.println(".plusHours() -> " + plusHours);

        LocalTime plusMinutes = time.plusMinutes(33);
        System.out.println(".plusMinutes() -> " + plusMinutes);

        LocalTime plusSeconds = time.plusSeconds(13);
        System.out.println(".plusSeconds() -> " + plusSeconds);
    }
}
