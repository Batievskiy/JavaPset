// 1. Write a Java program to create a new tree set,
// add some colors (string) and print out the tree set.

import java.util.TreeSet;

public class TreeSetExercise1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("green");
        treeSet.add("blue");
        treeSet.add("orange");
        treeSet.add("white");
        treeSet.add("black");

        // print out
        System.out.println("treeSet -> " + treeSet);

        // or using for loop
        for (String value : treeSet) {
            System.out.println(value);
        }
    }
}
