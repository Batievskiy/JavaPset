import java.util.LinkedList;

// 26. Write a Java program to replace an element in a linked list.
public class LinkedListExercise26 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int index = 1; index < 10; index++) {
            linkedList.add(index * 11);
        }
        System.out.println("original -> " + linkedList);

        // replace using .set()
        linkedList.set(4, 100500);
        System.out.println("replaced -> " + linkedList);
    }
}
