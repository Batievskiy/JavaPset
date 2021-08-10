// 19. Write a Java program
// to remove and get a key-value mapping
// associated with the least key in a map

import java.util.TreeMap;

public class TreeMapExercise19 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".pollFirstEntry() -> " + treeMap.pollFirstEntry());
        System.out.println("treeMap -> " + treeMap);
        System.out.println(".pollFirstEntry() -> " + treeMap.pollFirstEntry());
        System.out.println("treeMap -> " + treeMap);
        System.out.println(".pollFirstEntry() -> " + treeMap.pollFirstEntry());
        System.out.println("treeMap -> " + treeMap);
    }
}
