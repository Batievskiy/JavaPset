// 3. Write a Java program to iterate through all elements
// in a linked list starting at the specified position.

import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;

public class LinkedListExercise3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getRandomString());
        }
        Iterator iterator = linkedList.listIterator(4);
        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            System.out.println(", ");
        }

    }
    private static String getRandomString() {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char c = (char) ('a' + random.nextInt(26));
            result.append(c);
        }
        return result.toString();
    }

}
