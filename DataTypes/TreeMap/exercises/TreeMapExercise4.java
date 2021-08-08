// 4. Write a Java program
// to search a value in a Tree Map

import java.util.TreeMap;

public class TreeMapExercise4 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("a1", "hello");
        treeMap.put("a2", "java");
        treeMap.put("a3", "world");
        System.out.println("treeMap -> " + treeMap);

        boolean isContainsValue = treeMap.containsValue("java");
        System.out.println("treeMap.containsValue(\"java\") ? -> " +
                isContainsValue);
    }
}
