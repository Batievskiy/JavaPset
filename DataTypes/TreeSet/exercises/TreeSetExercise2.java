import java.util.TreeSet;
import java.util.Iterator;
import java.util.stream.Collectors;

// 2. Write a Java program to iterate
// through all elements in a tree set.
public class TreeSetExercise2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("green");
        treeSet.add("blue");
        treeSet.add("orange");
        treeSet.add("white");
        treeSet.add("black");

        // print out
        System.out.println("treeSet -> " + treeSet);
        System.out.println();

        // iterate using iterator
        System.out.println("iterator ->");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.println("\n");

        // iterate using for-each loop
        System.out.println("for-each loop ->");
        for (String value : treeSet) {
            System.out.print(value);
            System.out.print(", ");
        }
        System.out.println("\n");

        // using forEach / stream
        System.out.println("forEach ->");
        treeSet.forEach(value -> System.out.print(value + ", "));
        System.out.println("\n");

        // using stream
        System.out.println("stream ->");
        System.out.println(treeSet.stream().map(String::valueOf).collect(Collectors.joining(", ")));
    }
}
