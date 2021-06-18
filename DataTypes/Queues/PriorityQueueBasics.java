// what is Priority Queue in Java?
// let's find out

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        System.out.println("---< Priority Queue in Java >---\n");

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

        // let's create queue object from PriorityQueue
        // used when the objects are supposed to be processed based on the priority
        // is based on the priority heap
        // The elements of the priority queue are ordered according to the natural ordering,
        // or by a Comparator provided at queue construction time,
        // depending on which constructor is used
        PriorityQueue<Integer> prQue = new PriorityQueue<>();


        // 1. .add() - adds elements.
        // The insertion order is not retained in the PriorityQueue
        // returns True or False
        System.out.println("1. .add() - adds elements to the queue ->");
        System.out.println("added? -> " + prQue.add(11));
        System.out.println("added? -> " + prQue.add(13));
        System.out.println("added? -> " + prQue.add(15));
        // print out elements of the Queue
        System.out.println("queue -> " + prQue + "\n");

        // 2. .peek() - return head of the queue without deleting it
        System.out.println("2. .peek() - return head of the queue ->");
        System.out.println("head -> " + prQue.peek());
        System.out.println("queue -> " + prQue + "\n");

        // 3. .poll() - return and remove head of queue
        System.out.println("3. .poll() - return and remove head of queue ->");
        System.out.println("removed head -> " + prQue.poll());
        System.out.println("queue -> " + prQue + "\n");

        // 4.1 Iterating the PriorityQueue using enhanced for-each loop
        System.out.println("4.1 Iterating the PriorityQueue using enhanced for-each loop ->");
        for (Integer integer : prQue) System.out.println(integer + ", ");
        System.out.println();

        // 4.2 Iterating the PriorityQueue using Iterator
        System.out.println("4.2 Iterating the PriorityQueue using Iterator ->");
        Iterator<Integer> itr = prQue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ", ");
        }
        System.out.println();

        prQue.add(17);
        prQue.add(21);
        // 5.1 .comparator() - used to order the elements in a PriorityQueue
        System.out.println("5. .comparator() - used to order the elements in a PriorityQueue ->");
        Comparator<? super Integer> cmpr = prQue.comparator();
        System.out.println("comparator value -> " + cmpr);
        System.out.println("queue has natural order -> " + prQue + "\n");

        // 5.2 elements with the highest priority at front of the Queue
        PriorityQueue<String> prStrQue = new
                PriorityQueue<>(new TheComparator());
        System.out.println("5.2 elements with the highest priority at front of the Queue ->");
        prStrQue.add("H");
        prStrQue.add("E");
        prStrQue.add("L");
        prStrQue.add("L");
        prStrQue.add("O");
        prStrQue.add("!");
        System.out.println("" + prStrQue);
    }

    static class TheComparator implements Comparator<String> {
        public int compare(String firstStr, String secondStr) {
            return secondStr.compareTo(firstStr);
        }
    }
}