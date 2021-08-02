// 10. Write a Java program
// to get the element in a tree set
// which is greater than or equal to the given element.

import java.util.TreeSet;

public class TreeSetExercise10 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        int greater = 77;

        initTreeSet(treeSet1, 10, 13);

        System.out.println("treeSet1 -> " + treeSet1);

        // get element greater that "greater"
        greaterThan(treeSet1, greater);
    }

    public static void initTreeSet(TreeSet<Integer> treeSet, int size, int modifier) {
        for (int i = 1; i < size; i++) {
            treeSet.add(i * modifier);
        }
    }

    public static void greaterThan(TreeSet<Integer> treeSet, int greater) {
        try {
            Integer number = treeSet.ceiling(greater);
            System.out.printf("greater than %d -> %d", greater, number);
        } catch (NullPointerException e) {
            System.out.println("nothing to check!" + e);
        }
    }
}
