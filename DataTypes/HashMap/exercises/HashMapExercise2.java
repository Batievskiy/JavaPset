// 2. Write a Java program to count
// the number of key-value (size) mappings in a map
import java.util.HashMap;

public class HashMapExercise2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");

        // size of hashMap
        int size = hashMap.size();
        System.out.println("size -> " + size);
    }
}
