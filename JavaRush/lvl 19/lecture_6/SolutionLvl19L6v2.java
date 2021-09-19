// printList(List<String>)
// - to print all elements of the list, passed as an argument.

// We have to recreate this method, but instead null - to print "This element is null"

// HINT: use orElse() of the object type Optional<String>

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Collections;

public class SolutionLvl19L6v2 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "first", "second", null, "fourth", "fifth");

        printList(stringList);
    }

    public static void printList(List<String> list) {
        String text = "This element is null";
        list.forEach(i -> System.out.println(Optional.ofNullable(i).orElse(text)));
        // list.forEach(i -> System.out.println(i == null ? text : i)); // alternative
    }
}
