// what is Queue in Java?
// let's find out

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        System.out.println("---< Queue in Java >---\n");

        /* Queue Interface is used to hold the elements
           about to be processed in FIFO(First In First Out) order.
           It is am ordered List of objects with its use limited
           to insert elements at the end of the list
           and deleting elements from the start of the list.
           Being an interface the queue needs a concrete class
           for the declaration and the most common classes
           are the PriorityQueue and LinkedList.

           Both the implementations are not thread safe.

           PriorityBlockingQueue is one alternative implementation
           if thread safe is needed
        */
        // let's create queue object from LinkedList
        Queue<Integer> q = new LinkedList<>();

        // 1. .add(element) - adds elements at the end(tail) of the queue
        // returns True or False
        System.out.println("1. .add() - adds elements to the queue ->");
        int N = 9; // queue length of N
        for (int i = 0; i < N; i++) {
            System.out.println("element added? -> " + q.add(fib(i)));
        }
        // print out elements of the Queue
        System.out.println("queue -> " + q + "\n");

        // 2. boolean .offer(element) - insert an element in the queue
        // returns True or False
        // since this method does not throws an exception
        // when the capacity of the container is full since it returns false
        // preferable to .add(element)
        System.out.println("2. boolean .offer(element) - insert an element in the queue ->");
        boolean offered = q.offer(34);
        System.out.println("element \"34\" offered for adding? -> " + offered);
        System.out.println("queue -> " + q + "\n");

        // 3.1 .remove() - removes the head of the Queue
        System.out.println("3.1 .remove() - removes the head of the Queue ->");
        // let's remove three elements
        for (int i = 0; i < 3; i++) {
            int removed = q.remove();
            System.out.println("removed head -> " + removed);
        }
        System.out.println("queue -> " + q + "\n");

        // 3.2 .remove(element) - removes the element of the Queue
        // If there are multiple such objects, then the first occurrence of the object is removed.
        System.out.println("3.2 .remove() - removes the element of the Queue ->");
        // let's remove three elements
        System.out.println("element \"21\" removed? -> " + q.remove(21));
        System.out.println("queue -> " + q + "\n");

        // 4. .peek() - view the head of the Queue without removing it
        int head = q.peek();
        System.out.println("4. .peek() - view the head of the Queue ->");
        System.out.println("head of the Queue -> " + head);
        System.out.println("queue -> " + q + "\n");

        // 5. .element() - is similar to .peek()
        // but it throws NoSuchElementException when the queue is empty
        int element = q.element();
        System.out.println("5. .element() - is similar to .peek() ->");
        System.out.println("element at the head -> " + element);
        System.out.println("queue -> " + q + "\n");

        // 6. .poll() - remove and return the hear of the Queue
        int headRemoved = q.poll();
        System.out.println("6. .poll() - view and remove the head of the Queue ->");
        System.out.println("removed head of the Queue -> " + headRemoved);
        System.out.println("queue -> " + q + "\n");

        // 7. .size() - returns size of the Queue
        int size = q.size();
        System.out.println("7. .size() - returns size of the Queue ->");
        System.out.println("size of the Queue -> " + size);
        System.out.println("queue -> " + q + "\n");
    }

    // Fibonacci numbers
    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
