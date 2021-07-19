// 9. Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayListInteger.add(i * 11);
        }
        System.out.println("arrayListInteger -> " + arrayListInteger);
        ArrayList<Integer> arrayListCopy = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arrayListCopy.add(i * 11);
        }

        // copy one ArrayList to another using Collections
        Collections.copy(arrayListCopy, arrayListInteger);
        System.out.println("arrayListCopy using Collections.copy() -> " + arrayListCopy);

        // copy using .addAll()
        ArrayList<Integer> copy1 = new ArrayList<>();
        copy1.addAll(arrayListInteger);
        System.out.println("copy1 using .addAll()-> " + copy1);

        // copy using constructor
        ArrayList<Integer> copy2 = new ArrayList<>(arrayListInteger);
        System.out.println("copy2 using constructor call -> " + copy2);

        // copy using Java 10
        List<Integer> copy = List.copyOf(arrayListInteger);
        System.out.println("copy using Java 10 List.copyOf() - > " + copy);
    }
}
