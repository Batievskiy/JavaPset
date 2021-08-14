import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

// print(HashSet<String>) - has to print out
// all elements of the HashSet using iterator()
public class SolutionLvl14L2v0 {
    public static void print(HashSet<String> words) {
        // we can simply do this:
//        for (String word : words) {
//            System.out.println(word);
//        }

        // of use iterator:
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }

    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
