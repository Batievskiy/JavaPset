// 9. Write a Java program
// to get the first (lowest) key
// and the last (highest) key currently in a map

import java.util.TreeMap;

public class TreeMapExercise9 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C2", "Red");
        treeMap.put("C1", "Green");
        treeMap.put("C4", "Black");
        treeMap.put("C3", "White");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".firstKey() -> " + treeMap.firstKey());
        System.out.println(".lastKey() -> " + treeMap.lastKey());

    }
}
