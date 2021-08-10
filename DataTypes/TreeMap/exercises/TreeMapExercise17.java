// 17. Write a Java program
// to get the greatest key
// strictly less than the given key.
// Return null if there is no such key

import java.util.TreeMap;

public class TreeMapExercise17 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".lowerKey(10) -> " + treeMap.lowerKey(10));
        System.out.println(".lowerKey(20) -> " + treeMap.lowerKey(20));
        System.out.println(".lowerKey(70) -> " + treeMap.lowerKey(70));
    }
}
