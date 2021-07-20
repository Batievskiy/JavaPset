import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// 20. Write a Java program to increase the size of an array list
public class ArrayListExercise20 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListStringOne= new ArrayList<>();
        arrayListStringOne.add("Red");
        arrayListStringOne.add("Green");
        arrayListStringOne.add("Black");
        arrayListStringOne.add("White");
        arrayListStringOne.add("Pink");
        System.out.println(arrayListStringOne);

        ArrayList<String> arrayListStringTwo= new ArrayList<>();
        arrayListStringTwo.add("Red");
        arrayListStringTwo.add("Green");
        arrayListStringTwo.add("Black");
        arrayListStringTwo.add("Pink");
        System.out.println(arrayListStringTwo);

        System.out.println("arrayListOne.size() -> " + arrayListStringOne.size());
        System.out.println("arrayListTwo.size() -> " + arrayListStringTwo.size());

        // increase size of the arrayLists using .ensureCapacity(size)
        arrayListStringOne.ensureCapacity(7);
        arrayListStringTwo.ensureCapacity(17);
    }
}
