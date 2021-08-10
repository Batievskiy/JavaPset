// 16. Write a Java program
// to get a key-value mapping associated with the greatest key
// strictly less than the given key.
// Return null if there is no such key

import java.util.TreeMap;

public class TreeMapExercise16 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".lowerEntry(10) -> " + treeMap.lowerEntry(10));
        System.out.println(".lowerEntry(20) -> " + treeMap.lowerEntry(20));
        System.out.println(".lowerEntry(70) -> " + treeMap.lowerEntry(70));
    }
}
