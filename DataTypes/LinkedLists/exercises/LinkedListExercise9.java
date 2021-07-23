// 9. Write a Java program to insert some elements
// at the specified position into a linked list

import java.util.LinkedList;

public class LinkedListExercise9 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            linkedList.add(i * 13);
        }
        System.out.println("original linkedList -> " + linkedList);

        LinkedList<Integer> newLinkedList = new LinkedList<>();
        newLinkedList.add(1001001);
        newLinkedList.add(110011010);

        // add newLinkedList to linkedList
        linkedList.addAll(5, newLinkedList);
        System.out.println("added -> " + linkedList);
    }
}
