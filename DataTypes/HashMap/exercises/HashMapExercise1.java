// 1. Write a Java program to associate
// the specified value with the specified key in a HashMap

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

}
