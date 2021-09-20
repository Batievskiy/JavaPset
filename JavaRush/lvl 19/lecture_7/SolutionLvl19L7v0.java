// create the method getPositiveNumbers(Stream<Integer>)
// - to convert the Stream into the List of numbers more than 0.

// use .collect() method of the object Collector<List<Integer>>)

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionLvl19L7v0 {

    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(-1, 10, 43, -23, -56, 86);

        getPositiveNumbers(numberStream).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        return numbers.filter(n -> n > 0)
                .collect(Collectors.toList());
    }
}
