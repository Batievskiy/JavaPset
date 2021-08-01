import java.util.TreeSet;

// 7. Write a Java program
// to get the number of elements in a tree set.
public class TreeSetExercise7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Orange");
        treeSet1.add("White");
        treeSet1.add("Black");
        System.out.println("Tree set -> " + treeSet1);
        System.out.println();

        // using .size()
        System.out.println(".size() -> " + treeSet1.size());
    }
}
