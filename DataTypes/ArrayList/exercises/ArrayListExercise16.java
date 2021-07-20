import java.util.ArrayList;

// 16. Write a Java program to clone an array list to another array list.
public class ArrayListExercise16 {
    public static void main(String[] args) {
        ArrayList<String> arrayListStringOne= new ArrayList<String>();
        arrayListStringOne.add("Red");
        arrayListStringOne.add("Green");
        arrayListStringOne.add("Black");
        arrayListStringOne.add("White");
        arrayListStringOne.add("Pink");
        System.out.println(arrayListStringOne);

        // clone arrayList to another arrayList using .clone()
        ArrayList<String> arrayListCloned= (ArrayList<String>) arrayListStringOne.clone(); // <--- unsafe!
        System.out.println("arrayListCloned -> " + arrayListCloned);
    }
}
