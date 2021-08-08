// 6. Write a Java program
// to delete all elements from a given Tree Map.

import java.util.TreeMap;

public class TreeMapExercise6 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("one", "Neo");
        treeMap.put("two", "Trinity");
        treeMap.put("three", "Morpheus");
        System.out.println("treeMap -> " + treeMap);

        treeMap.clear();
        System.out.println("treeMap.clear() -> " + treeMap);
    }
}
