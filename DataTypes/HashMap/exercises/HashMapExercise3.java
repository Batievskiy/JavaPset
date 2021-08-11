// 3. Write a Java program to copy all of the mappings
// from the specified map to another map.

import java.util.HashMap;

public class HashMapExercise3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        // first way
        HashMap<Integer, String> copyHM = new HashMap<>(hashMap);
        System.out.println("copy1 -> " + copyHM);
        // second way
        HashMap<Integer, String> copyHM2 = new HashMap<>();
        copyHM2.putAll(hashMap);
        System.out.println("copy2 -> " + copyHM2);
    }
}
