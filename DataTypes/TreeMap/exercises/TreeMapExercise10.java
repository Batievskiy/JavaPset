// 10. Write a Java program
// to get a reverse order view of the keys
// contained in a given map.

import java.util.TreeMap;

public class TreeMapExercise10 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(3, "three");
        treeMap.put(4, "four");
        treeMap.put(5, "five");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".descendingMap() -> " + treeMap.descendingMap());
        System.out.println(".descendingKeySet() -> " +
                treeMap.descendingKeySet());

    }
}
