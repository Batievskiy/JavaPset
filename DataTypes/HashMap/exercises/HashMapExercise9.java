// 9. Write a Java program to create
// a set view of the mappings contained in a map

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercise9 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
        System.out.println("Set values -> " + set);

    }
}
