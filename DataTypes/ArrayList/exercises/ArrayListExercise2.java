import java.util.ArrayList;

//Write a Java program to iterate through all elements in a array list.
public class ArrayListExercise2 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("red");
        arrayListString.add("green");
        arrayListString.add("blue");
        arrayListString.add("black");
        arrayListString.add("white");

        for (String element : arrayListString) {
            System.out.println(element);
        }
    }
}
