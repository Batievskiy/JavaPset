// in method convert() we have to convert Map into Set
// if in sourceMap was two such elements:
// -> 2018-05-31=[12:43:00.615424667, 08:35:29.212766273]
// -> 1998-01-31=[07:56:59.031458499]
// then in Set we have to add three elements:
// -> 2018-05-31T12:43:00.615424667
// -> 2018-05031T08:35:29.212766273
// -> 1998-01-31T07:56:59.901458499

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SolutionLvl17L6v0 {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap =
                DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());
    }

    public static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> result = new HashSet<>();

        for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
            for (LocalTime time : entry.getValue()) {
                result.add(LocalDateTime.of(entry.getKey(), time));
            }
        }
        return result;
    }

    public static void printCollection(Collection<?> collection) {
        System.out.println("__________________________________");
        collection.forEach(System.out::println);
    }
}

class DateTimeGenerator {

    private static final long MIN_DAY = LocalDate.of(1990, 1, 1).toEpochDay();
    private static final long MAX_DAY = LocalDate.of(2020, 12, 31).toEpochDay();

    private static long maxNano = 86399999999999L;

    public static LocalDate generateDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(MIN_DAY, MAX_DAY);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static LocalTime generateTime() {
        long randomTime = ThreadLocalRandom.current().nextLong(0, maxNano);
        return LocalTime.ofNanoOfDay(randomTime);
    }

    public static List<LocalTime> generateTimeList() {
        List<LocalTime> timeList = new ArrayList<>();
        int size = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < size; i++) {
            timeList.add(generateTime());
        }
        return timeList;
    }

    public static Map<LocalDate, List<LocalTime>> generateDateMap() {
        Map<LocalDate, List<LocalTime>> dateMap = new HashMap<>();
        int size = ThreadLocalRandom.current().nextInt(3, 7);
        for (int i = 0; i < size; i++) {
            dateMap.put(generateDate(), generateTimeList());
        }
        return dateMap;
    }
}
