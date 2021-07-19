// 8. Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise8 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("e");
        arrayListString.add("d");
        arrayListString.add("c");
        arrayListString.add("b");
        arrayListString.add("a");
        System.out.println("arrayListString -> " + arrayListString);
        // sorting ArrayList using Collections
        Collections.sort(arrayListString);
        System.out.println("arrayListString sorted -> " + arrayListString);
    }
}
