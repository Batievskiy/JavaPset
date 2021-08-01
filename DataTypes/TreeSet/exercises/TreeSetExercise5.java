// 5. Write a Java program to get the first
// and last elements in a tree set.
import java.util.TreeSet;

public class TreeSetExercise5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");
        System.out.println("Tree set -> " + treeSet);
        System.out.println();

        // find first element
        Object first = treeSet.first();
        System.out.println("first -> " + first);
        Object last = treeSet.last();
        System.out.println("last -> " + last);
    }
}
