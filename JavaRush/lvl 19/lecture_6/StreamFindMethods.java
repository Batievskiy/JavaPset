import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindMethods {
    public static void main(String[] args) {

        // .findFirst() - returns first element in the Stream
        ArrayList<String> arrayListString = new ArrayList<>();
        Collections.addAll(arrayListString, "Java", "World", "is", "the", "Best");
        String s1 = arrayListString.stream().findFirst().get(); // "Java"
        // detailed way:
        Stream<String> stringStream = arrayListString.stream();
        Optional<String> findFirstOptional = stringStream.findFirst();
        String s2 = findFirstOptional.get();

        // .findAny() - returns any element from the Stream
        Optional<String> findAnyOptional = stringStream.findAny();
        String s3 = findAnyOptional.get();

        // .min() - returns minimal element using Comparator
        String minString = arrayListString.stream().min(Comparator.comparingInt(String::length)).get();
    }
}

