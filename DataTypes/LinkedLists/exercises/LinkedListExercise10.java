// 10. Write a Java program to get the first and last
// occurrence of the specified elements in a linked list.

import java.util.LinkedList;

public class LinkedListExercise10 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            linkedList.add(i * 12);
        }
        System.out.println("original linkedList -> " + linkedList);

        Object firstElement = linkedList.getFirst();
        Object lastElement = linkedList.getLast();
        System.out.println("first element -> " + firstElement);
        System.out.println("last element -> " + lastElement);
    }
}
