import java.time.Instant;

public class InstantGetters {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant.now() -> " + Instant.now());

        long epochSecond = instant.getEpochSecond();
        System.out.println(".getEpochSecond() -> " + instant.getEpochSecond());

        int nano = instant.getNano();
        System.out.println(".getNano() -> " + instant.getNano());

        long mills = instant.toEpochMilli();
        System.out.println(".toEpochMilli() -> " + instant.toEpochMilli());
    }
}
