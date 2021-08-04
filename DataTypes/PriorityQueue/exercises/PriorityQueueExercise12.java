// 12. Write a Java program
// to change priorityQueue to maximum priority queue.

import java.util.PriorityQueue;
import java.util.Collections;
public class PriorityQueueExercise12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);
        pQueue.add(4);
        pQueue.add(5);
        System.out.println("pQueue -> " + pQueue);
        System.out.println();
        Integer val = null;
        System.out.print("maxPQueue -> ");
        while ((val = pQueue.poll()) != null) {
            System.out.print(val + " ");
        }
        System.out.print("\n");






    }
}
