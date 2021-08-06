import java.util.HashMap;

// 4. Write a Java program to remove
// all of the mappings from a map.
public class HashMapExercise4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        hashMap.clear();
        System.out.println("removed - > " + hashMap);
    }
}
