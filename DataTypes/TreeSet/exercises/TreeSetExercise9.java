// 9. Write a Java program to find the numbers
// less than 77 in a tree set

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercise9 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        initTreeSet(treeSet1, 10, 11);
        int less = 77;

        System.out.println("treeSet1 -> " + treeSet1);

        // find numbers less than 77
        @SuppressWarnings("unchecked")
        TreeSet<Integer> numbersLessThan = (TreeSet) treeSet1.headSet(less);
        Iterator<Integer> iterator = numbersLessThan.iterator();

        System.out.printf("numbers less than %d -> ", less);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }



    }

    public static void initTreeSet(TreeSet<Integer> treeSet, int size, int modifier) {
        for (int i = 1; i < size + 1; i++) {
            treeSet.add(i * modifier);
        }
    }
}
