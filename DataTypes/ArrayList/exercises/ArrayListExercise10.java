// Write a Java program to shuffle elements in a array list.
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExercise10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            arrayListInteger.add(i * 11);
        }
        System.out.println("arrayListInteger -> " + arrayListInteger);
        // shuffle arrayList using Collections
        Collections.shuffle(arrayListInteger);
        System.out.println("arrayListInteger shuffled -> " + arrayListInteger);
    }
}
