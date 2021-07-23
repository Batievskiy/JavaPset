// 8. Write a Java program to insert
// the specified element at the end of a linked list

import java.util.LinkedList;

public class LinkedListExercise8 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            linkedList.add(i * 13);
        }
        System.out.println("original linkedList -> " + linkedList);

        linkedList.offerLast(1001101);

        System.out.println("offered elements -> " + linkedList);


    }
}
