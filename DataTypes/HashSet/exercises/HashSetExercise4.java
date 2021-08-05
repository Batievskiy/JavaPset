// 4. Write a Java program to empty an hash set.

import java.util.HashSet;

public class HashSetExercise4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        System.out.println("hashSet -> " + hashSet);

        hashSet.removeAll(hashSet);

        System.out.println("hashSet.removeAll() -> " + hashSet);
        System.out.println();

        // or use .clear()
        hashSet.add("five");
        hashSet.add("six");
        hashSet.add("seven");
        hashSet.add("eight");
        System.out.println("hashSet -> " + hashSet);
        hashSet.clear();

        System.out.println("hashSet.clear() -> " + hashSet);
    }
}
