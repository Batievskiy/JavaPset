import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// 19. Write a Java program to trim the capacity of an array list the current list size.
public class ArrayListExercise19 {
    public static void main(String[] args) throws Exception {
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

        // trim arrayLists using .trim();
        arrayListStringOne.trimToSize();
        arrayListStringTwo.trimToSize();
    }
}
