import java.util.ArrayList;

// 18. Write a Java program to test an array list is empty or not.
public class ArrayListExercise18 {
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

        // clear arrayLists using .isEmpty();
        boolean isAlOneEmpty = arrayListStringOne.isEmpty();
        arrayListStringTwo.clear();
        boolean isAlTwoEmpty = arrayListStringTwo.isEmpty(); // easy ;)
        System.out.println("arrayListStringOne.isEmpty() ? -> " + isAlOneEmpty);
        System.out.println("arrayListStringTwo.isEmpty() ? -> " + isAlTwoEmpty);
    }
}
