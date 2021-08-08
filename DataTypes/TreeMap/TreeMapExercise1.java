// 1. Write a Java program
// to associate the specified value
// with the specified key in a Tree Map.

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExercise1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");

        System.out.println("treeMap -> " + treeMap);

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.printf("key %d -> value %s\n", entry.getKey(), entry.getValue());
        }
    }
}
