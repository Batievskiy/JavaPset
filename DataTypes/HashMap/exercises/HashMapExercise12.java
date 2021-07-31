// 12. Write a Java program to get a collection view
// of the values contained in this map

import java.util.Collection;
import java.util.HashMap;

public class HashMapExercise12 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        Collection<String> values = hashMap.values();
        System.out.println("collection view is -> " + values);
    }
}
