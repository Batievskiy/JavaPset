import java.util.Collections;
import java.util.LinkedList;

// 16. Write a Java program to shuffle
// the elements in a linked list
public class LinkedListExercise16 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i * 11);
        }
        System.out.println("original -> " + linkedList);
        // shuffle
        Collections.shuffle(linkedList);
        System.out.println("shuffled -> " + linkedList);
    }
}
