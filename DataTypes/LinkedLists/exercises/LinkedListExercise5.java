// 5. Write a Java program to insert the specified element
// at the specified position in the linked list.

import java.util.LinkedList;

public class LinkedListExercise5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            linkedList.add(i * 11);
        }
        System.out.println("original linkedList -> " + linkedList);
        linkedList.add(7, 1010101010);
        System.out.println("inserted element in linkedList -> " + linkedList);
    }

}
