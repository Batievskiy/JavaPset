// 12. Write a Java program to remove
// a specified element from a linked list.

import java.util.LinkedList;
import java.util.Random;

public class LinkedListExercise12 {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(rndChar());
        }
        System.out.println("original linkedList -> " + linkedList);

        // remove element
        linkedList.remove(3); // by its index
        linkedList.remove(); // removing 0-th index (head) element
        linkedList.remove(Character.valueOf('v')); // removing an Object
        System.out.println("after removing -> " + linkedList);
    }
    private static Character rndChar() {
        Character character = 'a';
        Random random = new Random();
        character = (char)('a' + random.nextInt(26));
        return character;
    }
}
