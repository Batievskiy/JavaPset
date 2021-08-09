// 8. Write a Java program
// to get a key-value mapping associated with
// the greatest key and the least key in a map.

import java.util.TreeMap;

public class TreeMapExercise8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".firstEntry() -> " + treeMap.firstEntry());
        System.out.println(".lastEntry() -> " + treeMap.lastEntry());
    }
}
