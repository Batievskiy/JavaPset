// 6. Write a Java program
// to clone a hash set to another hash set

import java.util.HashSet;

public class HashSetExercise6 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        System.out.println("hashSet -> " + hashSet);

        HashSet<String> cloneHashSet = new HashSet<>();
        cloneHashSet = (HashSet) hashSet.clone();
        System.out.println("cloneHashSet -> " + cloneHashSet);
    }
}
