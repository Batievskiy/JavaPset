// 13. Write a Java program to remove first
// and last element from a linked list

import java.util.LinkedList;
import java.util.Random;

public class LinkedListExercise13 {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getChar());
        }
        System.out.println("original linkedList -> " + linkedList);
        // removing first and last
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("after removing -> " + linkedList);

    }
    private static Character getChar() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }
}
