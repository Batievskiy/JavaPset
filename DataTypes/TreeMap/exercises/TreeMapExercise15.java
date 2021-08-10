// 15. Write a Java program
// to get the least key strictly greater
// than the given key. Return null if there is no such key.

import java.util.TreeMap;

public class TreeMapExercise15 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".higherEntry(10) -> " + treeMap.higherEntry(10));
        System.out.println(".higherEntry(20) -> " + treeMap.higherEntry(20));
        System.out.println(".higherEntry(70) -> " + treeMap.higherEntry(70));
    }
}
