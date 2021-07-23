// 6. Write a Java program to insert elements
// into the linked list at the first and last position.

import java.util.LinkedList;

public class LinkedListExercise6 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            linkedList.add(fib(i));
        }
        System.out.println("original linkedList ->" + linkedList);
        linkedList.addFirst(101010101);
        /* from inside
         public void addFirst(E e) {
            if (e == null)
                throw new NullPointerException();
            elements[head = (head - 1) & (elements.length - 1)] = e;
            if (head == tail)
                doubleCapacity();
        }
         */
        linkedList.addLast(1110100010);
        System.out.println("added first and last -> " + linkedList);

    }
    private static int fib(int n) {
        if ( n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
