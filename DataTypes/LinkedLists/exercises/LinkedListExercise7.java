// 7. Write a Java program to insert the specified element
// at the front of a linked list.

import java.util.LinkedList;

public class LinkedListExercise7 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            linkedList.add(fib(i));
        }
        System.out.println("original linkedList -> " + linkedList);

        linkedList.offerFirst(100101010);
        /* from inside
            public boolean offerFirst(E e) {
            addFirst(e);
            return true;
        }
         */
        System.out.println("inserted -> " + linkedList);


    }
    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + (n - 2);
    }
}
