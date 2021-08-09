// 11. Write a Java program
// to get a key-value mapping
// associated with the greatest key
// less than or equal to the given key.

import java.util.TreeMap;

public class TreeMapExercise11 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(4, "four");
        treeMap.put(6, "six");
        treeMap.put(8, "eight");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".floorEntry(3) -> " + treeMap.floorEntry(3));
        System.out.println(".floorEntry(5) -> " + treeMap.floorEntry(5));
        System.out.println(".floorEntry(1) -> " + treeMap.floorEntry(1));
    }
}
