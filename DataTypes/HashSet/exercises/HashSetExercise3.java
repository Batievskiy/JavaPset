// 3. Write a Java program
// to get the number of elements in a hash set

import java.util.HashSet;

public class HashSetExercise3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        System.out.println("hashSet -> " + hashSet);

        // check size() of hashSet
        int size = hashSet.size();
        System.out.println("hashSet.size() -> " + size);
    }
}
