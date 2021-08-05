// Write a Java program
// to append the specified element to the end of a hash set

import java.util.HashSet;

public class HashSetExercise1 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        // print the hash set
        System.out.println("The Hash Set: " + hashSet);
    }
}
