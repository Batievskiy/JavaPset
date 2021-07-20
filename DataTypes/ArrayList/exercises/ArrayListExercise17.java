import java.util.ArrayList;

// 17. Write a Java program to empty an array list.
public class ArrayListExercise17 {
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

        // clear arrayLists using .clear();
        arrayListStringOne.clear();
        arrayListStringTwo.clear(); // easy ;)
        System.out.println("arrayListStringOne cleared -> " + arrayListStringOne);
        System.out.println("arrayListStringTwo cleared -> " + arrayListStringTwo);
    }
}
