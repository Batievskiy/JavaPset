// 7. Write a Java program to test
// if a map contains a mapping for the specified Value

import java.util.HashMap;

public class HashMapExercise8 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        // check if contains Value
        System.out.println(".containsValue(\"java\") -> " + hashMap.containsValue("java"));

    }
}
