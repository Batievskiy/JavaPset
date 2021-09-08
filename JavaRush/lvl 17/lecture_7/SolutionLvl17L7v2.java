// changeZone() - has to change time using another zoneId time
// fromTime - available time
// fromZone - available zoneId
// toZone - destination zoneId

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;

public class SolutionLvl17L7v2 {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime
                        .of(2020, 3, 19, 1, 40),
                zone1, zone2);
        System.out.println(time);

    }

    public static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        return fromDateTime
                .atZone(fromZone)
                .withZoneSameInstant(toZone)
                .toLocalDateTime();
    }
}
