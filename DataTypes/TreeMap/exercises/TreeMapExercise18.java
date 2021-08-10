// 18. Write a Java program
// to get NavigableSet view of the keys
// contained in a map.

import java.util.TreeMap;

public class TreeMapExercise18 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".navigableKeySet() -> " + treeMap.navigableKeySet());
    }
}
