// 3. Write a Java program
// to add all the elements of a priority queue to another priority queue.

import java.util.PriorityQueue;

public class PriorityQueueExercise3 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);

        PriorityQueue<String> copyQueue = new PriorityQueue<>();
        copyQueue.addAll(queue);
        System.out.println(".addAll(queue) -> " + copyQueue);

    }
}
