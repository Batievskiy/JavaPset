import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBasics {
    public static void main(String[] args) throws IOException {

        // .empty() - creates an empty Stream
        Stream<String> streamEmpty = Stream.empty();

        // Collection(Collection, Lst, Set...)
        Collection<String> stringCollection = Arrays.asList("a", "b", "c");
        Stream<String> stringStreamOfCollection = stringCollection.stream();

        // stream of Array
        Stream<Integer> integerStreamOfArray = Stream.of(1, 2, 3, 4, 5, 6, 7);

        // Stream.builder()
        Stream<String> stringStreamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

        // Stream.generate()
        Stream<String> stringStreamGenerate =
                Stream.generate(() -> "element").limit(10);

        // Stream of Primitives
        // .range(int startInclusive, int endExclusive):
        IntStream intStream = IntStream.range(1, 10);
        LongStream longStream = LongStream.range(1, 10);
        // .rangeClosed(int startInclusive, int endInclusive)
        IntStream intStreamInclusive = IntStream.rangeClosed(1, 10);

        // Random Stream generating:
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(10);

        // Stream of String
        IntStream streamOfString = "qwerty".chars();

        // braking a String into sub-strings according to specific RegEx:
        // Pattern.compile(RegEx).splitAsStream()
        Stream<String> streamOfStringsSubs =
                Pattern.compile(", ").splitAsStream("a, b, c");

        // Stream of File
        Path path = Paths.get("input.txt");
        Stream<String> streamOfStrings = Files.lines(path); // IOException here
        Stream<String> streamWithCharset =
                Files.lines(path, StandardCharsets.UTF_8);
    }

    // we often use the empty() method upon creation
    // to avoid returning null for Stream with no elements:
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
