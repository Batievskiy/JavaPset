// create three methods:
// 1. getMaxFromMilliseconds() - return max Instant using .ofEpochMilli()
// 2. getMaxFromSeconds() - return max Instant using .ofEpochSecond()
// 3. getMxsFromSecondsAndNanos() - return max Instant using .ofEpochSecond(seconds, nanos)

import java.time.Instant;

public class SolutionLvl17L6v2 {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    public static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    public static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    public static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
}
