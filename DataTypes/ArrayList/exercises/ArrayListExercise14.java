import java.util.ArrayList;
import java.util.Collections;

// 14. Write a Java program of swap two elements in an array list.
public class ArrayListExercise14 {
    public static void main(String[] args) {
        ArrayList<String> arrayListStringOne= new ArrayList<String>();
        arrayListStringOne.add("Red");
        arrayListStringOne.add("Green");
        arrayListStringOne.add("Black");
        arrayListStringOne.add("White");
        arrayListStringOne.add("Pink");
        System.out.println(arrayListStringOne);

        ArrayList<String> arrayListStringTwo= new ArrayList<String>();
        arrayListStringTwo.add("Red");
        arrayListStringTwo.add("Green");
        arrayListStringTwo.add("Black");
        arrayListStringTwo.add("Pink");
        System.out.println(arrayListStringTwo);

        // Swapping using collections
        Collections.swap(arrayListStringOne, 0, 2);
        Collections.swap(arrayListStringTwo, 2, 3);
        System.out.println("arrayListStringOne after swap -> " + arrayListStringOne);
        System.out.println("arrayListStringTwo after swap -> " + arrayListStringTwo);

    }
}
