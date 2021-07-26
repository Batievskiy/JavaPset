// 6. Write a Java program to get
// a shallow copy of a HashMap instance

import java.util.HashMap;

public class HashMapExercise6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "qwerty");
        hashMap.put(2, "asdfgh");
        hashMap.put(3, "zxcvbn");
        System.out.println("original -> " + hashMap);

        // shallow copy using clone
        System.out.println("shallow copy -> " + hashMap.clone());
    }
}
