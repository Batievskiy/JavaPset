// 10. Write a Java program to get
// the value of a specified key in a map.

import java.util.HashMap;

public class HashMapExercise10 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        // get values using .get(key)
        String string1 = hashMap.get(1);
        String string2 = hashMap.get(2);
        String string3 = hashMap.get(3);
        System.out.println("key 1 value -> " + string1);
        System.out.println("key 2 value -> " + string2);
        System.out.println("key 3 value -> " + string3);
    }
}
