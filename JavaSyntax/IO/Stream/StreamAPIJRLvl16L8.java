import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIJRLvl16L8 {
    public static void main(String[] args) throws IOException {
        String fileName = "input.txt";
        Stream<String> stringStream = Files.lines(Paths.get(fileName));

        List<String> resultList = stringStream
                .filter(line -> line.startsWith("Java"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        resultList.forEach(System.out::println);
    }
}
