import java.util.TreeSet;

// 8. Write a Java program to compare two tree sets.
public class TreeSetExercise8 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Orange");
        System.out.println("treeSet1 -> " + treeSet1);

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Red");
        treeSet2.add("White");
        treeSet2.add("Orange");
        System.out.println("treeSet2 -> " + treeSet2);
        System.out.println();

        // compare using .contains
        for (String value : treeSet1) {
            System.out.println(treeSet2.contains(value) ? "yes" : "no");
        }
    }
}
