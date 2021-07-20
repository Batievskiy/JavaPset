import java.util.ArrayList;

// 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
public class ArrayListExercise22 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add(" ;)");
        System.out.println("original arrayList -> " + arrayList);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(4));
    }
}
