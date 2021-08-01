import java.util.TreeSet;

// 3. Write a Java program to add all the elements
// of a specified tree set to another tree set.
public class TreeSetExercise3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("one");
        treeSet1.add("two");
        treeSet1.add("three");
        System.out.println("treeSet1 -> " + treeSet1);

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("four");
        treeSet2.add("five");
        treeSet2.add("six");
        System.out.println("treeSet2 -> " + treeSet2);

        // copy all elements using .addAll()
        TreeSet<String> treeSetCopy = new TreeSet<>(treeSet1);

        treeSetCopy.addAll(treeSet2);
        System.out.println("treeSetCopy -> " + treeSetCopy);
    }
}

