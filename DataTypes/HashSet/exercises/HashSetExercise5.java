// 5. Write a Java program
// to test a hash set is empty or not

import java.util.HashSet;

public class HashSetExercise5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("five");
        hashSet.add("six");
        hashSet.add("seven");
        hashSet.add("eight");
        System.out.println("hashSet -> " + hashSet);

        // check isEmpty of not?
        System.out.println("hashSet.isEmpty() ? -> " + hashSet.isEmpty());

        hashSet.clear();
        System.out.println("hashSet.clear() -> " + hashSet);

        // check isEmpty of not?
        System.out.println("hashSet.isEmpty() ? -> " + hashSet.isEmpty());
    }
}
