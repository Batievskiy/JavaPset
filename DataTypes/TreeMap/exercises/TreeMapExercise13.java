// 13. Write a Java program
// to get the portion of a map
// whose keys are strictly less than a given key.

import java.util.TreeMap;

public class TreeMapExercise13 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".headMap(10) -> " + treeMap.headMap(10));
        System.out.println(".headMap(30) -> " + treeMap.headMap(30));
        System.out.println(".headMap(70) -> " + treeMap.headMap(70));
    }
}
