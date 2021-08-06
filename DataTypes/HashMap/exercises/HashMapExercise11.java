// 11. Write a Java program to get
// a set view of the keys contained in this map
import java.util.HashMap;
import java.util.Set;

public class HashMapExercise11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "java");
        hashMap.put(3, "world");
        System.out.println("original -> " + hashMap);

        Set keySet = hashMap.keySet();
        System.out.println("key set values -> " + keySet);
    }
}
