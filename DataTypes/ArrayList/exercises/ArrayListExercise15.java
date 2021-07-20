import java.util.ArrayList;

// 15. Write a Java program to join two array lists.
public class ArrayListExercise15 {
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

        // join arrayLists using new arrayList using addAll();
        ArrayList<String> arrayListJoined = new ArrayList<>();
        arrayListJoined.addAll(arrayListStringOne);
        arrayListJoined.addAll(arrayListStringTwo);
        System.out.println("arrayListJoined -> " + arrayListJoined);
    }
}
