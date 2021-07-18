// 1. Write a Java program to create a new array list,
// add some colors (string) and print out the collection.

import java.util.*;

public class ArrayListExercise1 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("red");
        arrayListString.add("green");
        arrayListString.add("blue");
        arrayListString.add("black");
        arrayListString.add("white");
        System.out.println(arrayListString);
    }
}
