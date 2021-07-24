import java.util.Collections;
import java.util.LinkedList;

// 15. Write a Java program of swap
// two elements in a linked list.
public class LinkedListExercise15 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("<--->");
        linkedList.add("world");
        System.out.println("original -> " + linkedList);
        // swap elements
        Collections.swap(linkedList, 0, 2);
        System.out.println("swapped -> " + linkedList);
    }
}
