import java.util.LinkedList;

// 19. Write a Java program to remove
// and return the first element of a linked list.
public class LinkedListExercise19 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        System.out.println("original -> " + linkedList);

        // remove first and return it
        System.out.println("removed -> " + linkedList.pop());
    }
}
