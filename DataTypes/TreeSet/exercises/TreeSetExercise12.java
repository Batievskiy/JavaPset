// 12. Write a Java program
// to get the element in a tree set
// which is strictly greater than the given element.

import java.util.TreeSet;

public class TreeSetExercise12 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer N = 77;
        initTreeSet(treeSet, 10, 14);
        System.out.println("treeSet -> " + treeSet);

        // find element less of equal to N
        System.out.println("higher than " + N + " -> " + treeSet.higher(N));
    }

    public static void initTreeSet(TreeSet<Integer> treeSet, int size, int modifier) {
        for (int i = 1; i < size + 1; i++) {
            treeSet.add(i * modifier);
        }
    }
}

