// 5. Write a Java program
// to get all keys from the given a Tree Map

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapExercise5 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key_1", "value_1");
        treeMap.put("key_2", "value_2");
        treeMap.put("key_3", "value_3");

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.printf("key = %s | value = %s\n", entry.getKey(), entry.getValue());
        }

        Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
