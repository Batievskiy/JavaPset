// 7. Write a Java program to search an element in a array list.

import java.util.*;

public class ArrayListExercise7 {
    private static final int ELEMENT = 77;

    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            arrayListInteger.add(i * 11);
        }
        System.out.println(arrayListInteger);

        // search for the value 77
        if (arrayListInteger.contains(ELEMENT)) {
            System.out.println("found 77");
        } else {
            System.out.println("nor found 77");
        }
    }
}
