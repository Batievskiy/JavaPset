// 20. Write a Java program to retrieve but
// does not remove, the first element of a linked list.

import java.util.LinkedList;
import java.util.Random;

public class LinkedListExercise20 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getString());
        }
        System.out.println("original -> " + linkedList);

        // using .peekFirst()
        String first = linkedList.peekFirst();
        System.out.println("first -> " + first);
        System.out.println("original -> " + linkedList);
    }

    private static String getString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);

        }
        return sb.toString();
    }
}
