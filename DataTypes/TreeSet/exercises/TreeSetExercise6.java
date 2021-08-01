import java.util.TreeSet;

// 6. Write a Java program
// to clone a tree set list to another tree set.
public class TreeSetExercise6 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Orange");
        treeSet1.add("White");
        treeSet1.add("Black");
        System.out.println("Tree set -> " + treeSet1);
        System.out.println();

        // clone shallow copy using .clone() - only references are copied
        @SuppressWarnings("unchecked")
        TreeSet<String> treeSetClone = (TreeSet<String>) treeSet1.clone();
        System.out.println("treeSetClone -> " + treeSetClone);
        System.out.println();

        // deep copy
        TreeSet<String> copy = new TreeSet<>(treeSet1);
        System.out.println("copy -> " + copy);
    }
}
