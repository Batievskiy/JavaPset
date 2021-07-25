import java.util.LinkedList;

// 25. Write a Java program to test an linked list is empty or not.
public class LinkedListExercise25 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int index = 1; index < 10; index++) {
            linkedList.add(index * 11);
        }
        System.out.println("original -> " + linkedList);

        // check is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("is empty ? -> " + isEmpty);
    }
}
