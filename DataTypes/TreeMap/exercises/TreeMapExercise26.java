// 26. Write a Java program
// to get the least key greater than or equal
// to the given key.
// Returns null if there is no such key.

import java.util.TreeMap;

public class TreeMapExercise26 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(30, "two");
        treeMap.put(50, "three");
        treeMap.put(70, "four");
        treeMap.put(80, "five");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".ceilingKey(10) -> " + treeMap.ceilingKey(10));
        System.out.println(".ceilingKey(40) -> " + treeMap.ceilingKey(40));
        System.out.println(",ceilingKey(90) -> " + treeMap.ceilingKey(90));
    }
}
