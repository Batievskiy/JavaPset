// 23. Write a Java program
// to get a portion of a map
// whose keys are greater than or equal to a given key.

import java.util.TreeMap;

public class TreeMapExercise23 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(30, "three");
        treeMap.put(40, "four");
        treeMap.put(50, "five");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".tailMap(10) -> " + treeMap.tailMap(10));
        System.out.println(".tailMap(30) -> " + treeMap.tailMap(30));
        System.out.println(".tailMap(50) -> " + treeMap.tailMap(50));

    }
}
