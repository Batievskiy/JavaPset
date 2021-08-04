// 9. Write a Java program
// to retrieve and remove the first element.

import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueExercise9 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.add("one");
        pQueue.add("two");
        pQueue.add("three");
        pQueue.add("four");
        pQueue.add("five");
        System.out.println("pQueue -> " + pQueue);

        // removing elements
        for (int i = 0; i < 5; i++) {
            pQueue.poll();
            System.out.println("pQueue.poll() -> " + pQueue);
        }
    }
}
