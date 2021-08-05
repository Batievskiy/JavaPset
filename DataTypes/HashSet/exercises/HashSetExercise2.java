// 2. Write a Java program
// to iterate through all elements in a hash list.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExercise2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        System.out.println("hashSet -> " + hashSet);
        System.out.println();

        // iterate using for-each loop
        System.out.println("iterate using for-each loop:");
        int hashSetSize = hashSet.size();
        for (String string : hashSet) {
            System.out.println("element -> " + string);
        }
        System.out.println();

        // iterate using Iterator
        System.out.println("iterate using Iterator:");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("element -> " + iterator.next());
        }
        System.out.println();

        // using forEach() method
        System.out.println("using forEach() method:");
        hashSet.forEach(i -> System.out.println("element -> " + i));
    }
}
