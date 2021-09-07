// create all plus() and minus methods for Instant
// from Seconds to Days

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class SolutionLvl17L6v3 {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    public static Instant plusMinutes(Instant instant, long minutes) {
        return instant.plus(minutes, ChronoUnit.MINUTES);
    }

    public static Instant plusHours(Instant instant, long hours) {
        return instant.plus(hours, ChronoUnit.HOURS);
    }

    public static Instant plusDays(Instant instant, long days) {
        return instant.plus(days, ChronoUnit.DAYS);
    }

    public static Instant minusMinutes(Instant instant, long minutes) {
        return instant.minus(minutes, ChronoUnit.MINUTES);
    }

    public static Instant minusHours(Instant instant, long hours) {
        return instant.minus(hours, ChronoUnit.HOURS);
    }

    public static Instant minusDays(Instant instant, long days) {
        return instant.minus(days, ChronoUnit.DAYS);
    }
}
