// create the method getString(Stream<String>)
// - to convert the Stream into the String
// splitting the words by " ".

// use collect() of the object type Stream<String>
// pass as argument - the object type Collector<String>

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SolutionLvl19L7v3 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("To", "be", "the", "programmer", "or", "not", "to", "be!");
        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        return stringStream
                .collect(Collectors.joining(" "));
    }
}
