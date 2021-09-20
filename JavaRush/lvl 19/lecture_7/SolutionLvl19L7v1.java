// create the method getFilteredStrings(Stream<String>)
// - to convert Stream into the Set with Strings longer than six symbols.

// use collect() of the object Stream<String>
// as a parameter - send an object Collector<Set<String>>)

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionLvl19L7v1 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Java", "C++", "Python", "Javascript", "Swift");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        return stringStream
                .filter(s -> s.length() > 6)
                .collect(Collectors.toSet());
    }
}
