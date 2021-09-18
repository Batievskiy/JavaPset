// create method toUpperCase(Stream<String>)
// - to return Stream of Strings in upper case.
// ue .map() method

import java.util.stream.Stream;

public class SolutionLvl19L5v1 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Don't", "worry", ".", "Be", "happy");

        toUpperCase(stringStream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        return strings.map(String::toUpperCase);
    }
}
