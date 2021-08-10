// 20. Write a Java program
// to remove and get a key-value mapping
// associated with the greatest key in this map.

import java.util.TreeMap;

public class TreeMapExercise20 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".pollLastEntry() -> " + treeMap.pollLastEntry());
        System.out.println("treeMap -> " + treeMap);
        System.out.println(".pollLastEntry() -> " + treeMap.pollLastEntry());
        System.out.println("treeMap -> " + treeMap);
        System.out.println(".pollLastEntry() -> " + treeMap.pollLastEntry());
        System.out.println("treeMap -> " + treeMap);
    }
}
