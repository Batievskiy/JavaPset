// 25. Write a Java program
// to get a key-value mapping associated
// with the least key greater than or equal
// to the given key.
// Return null if there is no such key.

import java.util.TreeMap;

public class TreeMapExercise25 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(30, "two");
        treeMap.put(50, "three");
        treeMap.put(70, "four");
        treeMap.put(80, "five");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".ceilingEntry(20) -> " + treeMap.ceilingEntry(20));
        System.out.println(".ceilingEntry(40) -> " + treeMap.ceilingEntry(40));
        System.out.println(".ceilingEntry(90) -> " + treeMap.ceilingEntry(90));
    }
}
