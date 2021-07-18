//  Write a Java program to insert an element
//  into the array list at the first position.

import java.util.*;

public class ArrayListExercise3 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Pink");
        list_Strings.add(5, "Yellow");
        // Print the list
        System.out.println(list_Strings);
    }
}
