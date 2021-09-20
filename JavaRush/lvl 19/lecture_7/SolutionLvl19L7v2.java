// create the method getMap(Stream<String>)
// - to convert the Stream into the Map
// in which the Key is the String
// and the Value - its length.

// use collect() of the object Stream<String>
// as a parameter - pass the object typ of Collector<Map<String, Integer>>
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SolutionLvl19L7v2 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Java", "C++", "Python", "Javascript", "Swift");

        getMap(stringStream).forEach((key, value) -> System.out.println(key + " - " + value));

    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        return stringStream
                .collect(Collectors.toMap(string -> string, String::length));
    }
}
