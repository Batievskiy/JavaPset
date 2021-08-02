// 14. Write a Java program
// to retrieve and remove the first element of a tree set.

import java.util.TreeSet;

public class TreeSetExercise14 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        initTreeSet(treeSet, 10, 14);
        System.out.println("treeSet -> " + treeSet);

        // retrieve and remove the first element
        System.out.println("removed -> " + treeSet.pollFirst());
        System.out.println("treeSet -> " + treeSet);
    }

    public static void initTreeSet(TreeSet<Integer> treeSet, int size, int modifier) {
        for (int i = 1; i < size + 1; i++) {
            treeSet.add(i * modifier);
        }
    }
}
