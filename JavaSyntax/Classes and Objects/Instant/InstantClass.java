import java.time.Instant;

public class InstantClass {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant.now() -> " + instant);

        // particular instant
        Instant particularI = Instant.ofEpochSecond(60);
        System.out.println("Instant.ofEpochSecond() -> " + particularI);

        particularI = Instant.ofEpochMilli(300);
        System.out.println("Instant.ofEpochMilli() -> " + particularI);

        particularI = Instant.ofEpochSecond(45, 300);
        System.out.println("Instant.ofEpochSecond(epochSecond, nanoAdjustment)" +
                particularI);
    }
}
