import java.time.Instant;

public class InstantPlusMinus {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant.now() -> " + instant);

        Instant plusS = instant.plusSeconds(10);
        System.out.println(".plusSeconds() -> " + plusS);

        Instant plusM = instant.plusMillis(300);
        System.out.println(".plusMillis() -> " + plusM);

        Instant plusN = instant.plusNanos(3230);
        System.out.println(".plusNano() -> " + plusN);

        Instant minusS = instant.minusSeconds(45);
        System.out.println(".minusSeconds() -> " + minusS);

        Instant minusN = instant.minusNanos(2345);
        System.out.println(".minusNanos() -> " + minusN);
    }
}
