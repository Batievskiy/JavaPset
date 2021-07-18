// 6. Write a Java program to remove
// the third element from a array list.
import java.util.*;
public class ArrayListExercise6 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Remove the third element from the list.
        list_Strings.remove(2);
        // Print the list again
        System.out.println("After removing third element from the list:\n"+list_Strings);
    }
}
