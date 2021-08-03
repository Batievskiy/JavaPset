// 4. Write a Java program to insert a given element into a priority queue.

import java.util.PriorityQueue;

public class PriorityQueueExercise4 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);

        queue.offer("UNKNOWN");
        System.out.println(".offer(\"UNKNOWN\") -> " + queue);
    }
}
