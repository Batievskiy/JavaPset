// 21. Write a Java program to replace the second element of a ArrayList with the specified element.

import java.util.*;

public class ArrayListExercise21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("original colors -> " + colors);

        // replace element using .set(index, element)
        String replacedColor = "newColor";
        colors.set(1, replacedColor);
        System.out.println("replaced color to colors -> " + colors);
    }
}
