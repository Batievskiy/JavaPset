// 3. Write a Java program
// to search a key in a Tree Map.
import java.util.TreeMap;

public class TreeMapExercise3 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("c1", "one");
        treeMap.put("c2", "two");
        treeMap.put("c3", "three");
        treeMap.put("c4", "four");
        treeMap.put("c5", "five");
        System.out.println("treeMap -> " + treeMap);

        String key1 = "c1";

        if (treeMap.containsKey("c1")) {
            System.out.printf("treeMap contain key %s -> value %s", key1, treeMap.get("c1"));
        } else {
            System.out.printf("treeMap does not contain key %s -> value %s", key1, treeMap.get("c1"));

        }


    }
}

