import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSimpleExamples {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        integerStream.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        Stream<Integer> integerStream1 = Stream.of(new Integer[]{11, 22, 33, 44, 55, 66, 77});
        integerStream1.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            integerArrayList.add(i);
        }
        Stream<Integer> streamArrayList = integerArrayList.stream();
        streamArrayList.forEach(integer -> System.out.print(integer + ", "));
        System.out.println();

        Stream<Integer> streamRndNums = Stream.generate(() -> (new Random()).nextInt(100));
        streamRndNums.limit(10)
                .forEach(i -> System.out.print(i + ", "));
        System.out.println();

        IntStream streamChars = "1234qwerty".chars();
        streamChars.forEach(c -> System.out.print(c + ", "));
        System.out.println();

        Stream<String> streamSplit = Stream.of("A$B$C$D".split("\\$"));
        streamSplit.forEach(c -> System.out.print(c + ", "));
        System.out.println();

        Stream<Integer> randomStream = Stream.generate(() -> (new Random()).nextInt(100)).limit(10);
        List<Integer> evenNumbersList = randomStream.filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        evenNumbersList.forEach(n -> System.out.print(n + ", "));
        System.out.println();

        List<String> names = List.of(
                "James",
                "Allison",
                "Bill",
                "Andy",
                "Carl",
                "Angela",
                "Phil"
        );

        names.stream().filter(s -> s.startsWith("A"))
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        names.stream().filter(s -> s.endsWith("l"))
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        names.stream()
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        long count = names.stream()
                .count();
        System.out.println("count -> " + count);
        System.out.println();
    }
}
