// 12. Write a Java program
// to get the element in a tree set
// which is strictly lower than the given element.

import java.util.TreeSet;

public class TreeSetExercise13 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer N = 77;
        initTreeSet(treeSet, 10, 14);
        System.out.println("treeSet -> " + treeSet);

        // find element less of equal to N
        System.out.println("lower than " + N + " -> " + treeSet.lower(N));
    }

    public static void initTreeSet(TreeSet<Integer> treeSet, int size, int modifier) {
        for (int i = 1; i < size + 1; i++) {
            treeSet.add(i * modifier);
        }
    }
}

