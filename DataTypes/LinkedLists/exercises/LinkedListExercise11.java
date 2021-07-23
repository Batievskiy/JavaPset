// 11. Write a Java program to display the elements
// and their positions in a linked list.
import java.util.LinkedList;

public class LinkedListExercise11 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            linkedList.add(i * 3);
        }

        for (int index = 0; index < linkedList.size(); index++) {
            System.out.printf("element at the index %d is -> %d", index, linkedList.get(index) );
            System.out.println();
        }
    }
}
