// 1. Write a Java program to append
// the specified element to the end of a linked list.

import java.util.LinkedList;

public class LinkedListExercise1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i * 11);
        }
        System.out.println(linkedList);
    }
}
