// 14. Write a Java program
// to get the portion of this map
// whose keys are less than (or equal to, if inclusive is true)
// a given key

import java.util.TreeMap;

public class TreeMapExercise14 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "one");
        treeMap.put(20, "two");
        treeMap.put(40, "three");
        treeMap.put(50, "five");
        treeMap.put(60, "six");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".headMap(10, true) -> " + treeMap.headMap(10, true));
        System.out.println(".headMap(20, true) -> " + treeMap.headMap(20, true));
        System.out.println(".headMap(70, true) -> " + treeMap.headMap(70, true));
    }
}
