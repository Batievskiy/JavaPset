import java.util.stream.Stream;

public class StreamMatch {
    public static void main(String[] args) {

        // anyMatch() - is any of elements matches to statement?
        Stream<Integer> integerStream = Stream.of(-1, -2, 3, -4, -5, -6);
        boolean anyMatch = integerStream
                .anyMatch(i -> i > 0);
        System.out.println(anyMatch);

        // allMatch() - is all elements matches to statement?
        Stream<String> stringStream = Stream.of("Java", "Java", "Java");
        boolean allMatch = stringStream
                .allMatch(s -> s.equals("Java"));
        System.out.println(allMatch);

        Stream<Integer> integerStream1 = Stream.of(-1, -2, -3, -4, -5, -6, 1, 2);
        boolean allMatchZero = integerStream1
                .filter(i -> i > 0)
                .allMatch(x -> x > 0);
        System.out.println(allMatchZero);

        // noneMatch() - is none of elements matches to statement?
        Stream<Double> stringDouble = Stream.of(3.14, 11.1, 33.3, 0.0);
        boolean noneMatch = stringDouble
                .noneMatch(d -> d == 3.14);
        System.out.println(noneMatch);

    }
}
