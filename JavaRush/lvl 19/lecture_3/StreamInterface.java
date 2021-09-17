import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.Optional;

public class StreamInterface {
    public static void main(String[] args) {

        // finding max length string in array list
        ArrayList<String> arrayListString = new ArrayList<>();
        Collections.addAll(arrayListString, "Hello", ", ", "Java", " ", "World");
        String maxLengthString1 = arrayListString
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("maxLengthString -> " + maxLengthString1);

        // another way:
        Stream<String> streamString = arrayListString.stream();
        Optional<String> optionalString = streamString.max(Comparator.comparingInt(String::length));
        String maxLengthString2 = optionalString.get();
        System.out.println("maxLengthString2 -> " + maxLengthString2);
    }
}
