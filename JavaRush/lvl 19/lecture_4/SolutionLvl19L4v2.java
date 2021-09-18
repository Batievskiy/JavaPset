// method getDistinct(ArrayList<String>) - gets a List of words
// - there is a duplicates exist.

// We have to create this method
// - to return Stream of words without the duplicates.

// HINT - use method .distinct() of type Stream<String> object.

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SolutionLvl19L4v2 {
    public static void main(String[] args) {
        ArrayList<String> wordsArrayList = new ArrayList<>();
        Collections.addAll(wordsArrayList,
                "To", "become", "a", "programmer",
                "you", "need", "to", "program", ", ",
                "and", "to", "program", "you", "need", "to", "learn", ".");

        Stream<String> distinctWordsStream = getDistinctWords(wordsArrayList);
        distinctWordsStream.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        return words.stream()
                .distinct();
    }
}