// 4. Write a Java program to iterate a linked list in reverse order.

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExercise4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i * 11);
        }
        System.out.println("original linkedList -> " + linkedList);

        // using descendingIterator ;)))
        Iterator iterator = linkedList.descendingIterator();
        // print linkedList in reverse order
        System.out.print("reversed linkedList -> ");
        while (iterator.hasNext()) {
            System.out.print
                    (iterator.next());
            System.out.print(", ");
        }
    }
}
