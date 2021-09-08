// create getSortedZones - to return Set of all Zones
// create getBeijingTime - to return current time in Pekin

import java.util.TreeSet;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SolutionLvl17L7v0 {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingTime());
    }

    public static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    public static ZonedDateTime getBeijingTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
