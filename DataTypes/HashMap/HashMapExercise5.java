// 5. Write a Java program to check
// whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;

public class HashMapExercise5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "oops");
        hashMap.put(2, "nope");
        hashMap.put(3, "yeah");
        System.out.println("original -> " + hashMap);

        boolean isEmpty = hashMap.isEmpty();
        System.out.println("isEmpty ? -> " + isEmpty);

        hashMap.remove(1);
        hashMap.remove(2);
        hashMap.remove(3);
        System.out.println("after removing -> " + hashMap);

        System.out.println("isEmpty ? -> " + hashMap.isEmpty());
    }
}
