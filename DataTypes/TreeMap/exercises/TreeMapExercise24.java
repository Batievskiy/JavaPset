// 24. Write a Java program
// to get a portion of a map
// whose keys are greater than to a given key.

import java.util.TreeMap;

public class TreeMapExercise24 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(30, "three");
        treeMap.put(40, "four");
        treeMap.put(50, "five");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".tailMap(20, false) -> " +
                treeMap.tailMap(20, false));
        System.out.println(".tailMap(40, false) -> " +
                treeMap.tailMap(40, false));
        System.out.println(".tailMap(50, false) -> " +
                treeMap.tailMap(50, false));
    }
}
