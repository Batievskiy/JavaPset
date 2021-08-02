//16. Write a Java program
// to remove a given element from a tree set

import java.util.TreeSet;

public class TreeSetExercise16 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        initTreeSet(treeSet, 10, 14);
        System.out.println("treeSet -> " + treeSet);
        Integer toRemove = 70;

        // remove a given element
        System.out.printf("removed %d -> %s", toRemove, treeSet.remove(70));
        System.out.println();
        System.out.println("treeSet -> " + treeSet);
    }

    public static void initTreeSet(TreeSet<Integer> treeSet, int size, int modifier) {
        for (int i = 1; i < size + 1; i++) {
            treeSet.add(i * modifier);
        }
    }
}
