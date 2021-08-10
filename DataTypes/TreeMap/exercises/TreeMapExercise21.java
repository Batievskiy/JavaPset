// 21. Write a Java program
// to get the portion of a map
// whose keys range from a given key (inclusive),
// to another key (exclusive).

import java.util.TreeMap;

public class TreeMapExercise21 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".subMap(20, 50) -> " + treeMap.subMap(20, 50));
        System.out.println(".subMap(10, 40) -> " + treeMap.subMap(10, 40));
        System.out.println(".subMap(40, 60) -> " + treeMap.subMap(40, 60));
    }
}
