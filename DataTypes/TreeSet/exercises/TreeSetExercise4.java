import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

// 4. Write a Java program to create a reverse order view
// of the elements contained in a given tree set.
public class TreeSetExercise4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        System.out.println("treeSet -> " + treeSet);
        System.out.println();

        // reverse using Iterator
        System.out.println("Iterator ->");
        Iterator<String> iterator = treeSet.descendingIterator();
        System.out.print("reversed treeSet -> ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.println("\n");

        // reverse using .descendingSet()
        System.out.println(".descendingSet() ->");
        Set<String> descending = treeSet.descendingSet();
        for (String value : descending) {
            System.out.print(value + ", ");
        }
        System.out.println("\n");

        // using .reverseOrder() of Collections
        TreeSet<String> reversedCollections = new TreeSet<>(Collections.reverseOrder());
        reversedCollections.addAll(treeSet);
        System.out.println(".reverseOrder() -> " + reversedCollections);
        System.out.println("\n");

    }
}
