// 14. Write a Java program to remove all
// the elements from a linked list.

import java.util.LinkedList;
import java.util.Random;

public class LinkedListExercise14 {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getChar());
        }
        System.out.println("original linkedList -> " + linkedList);
        // removing first and last
        boolean b = linkedList.removeAll(linkedList);
        System.out.println("removing -> " + linkedList + " <- is " + b);

    }
    private static Character getChar() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }
}
