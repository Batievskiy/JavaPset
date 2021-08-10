// 22. Write a Java program
// to get the portion of a map
// whose keys range from a given key to another key

import java.util.TreeMap;

public class TreeMapExercise22 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".subMap(10, true, 40, true) -> " +
                treeMap.subMap(10, true, 40, true));
        System.out.println(".subMap(20, true, 50, true) -> " +
                treeMap.subMap(20, true, 50, true));
        System.out.println(".subMap(40, true, 70, true) -> " +
                treeMap.subMap(40, true, 70, true));
    }
}
