// 2. Write a Java program
// to copy a Tree Map content to another Tree Map

import java.util.TreeMap;

public class TreeMapExercise2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        System.out.println("treeMap -> " + treeMap);

        TreeMap<Integer, String> copyTreeMap = new TreeMap<>(treeMap);

        // copy using .putAll()
        copyTreeMap.putAll(treeMap);

        System.out.println("copyTreeMap -> " + copyTreeMap);
    }
}
