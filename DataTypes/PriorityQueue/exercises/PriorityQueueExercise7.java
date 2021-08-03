// 7. Write a Java program to compare two priority queues.

import java.util.PriorityQueue;

public class PriorityQueueExercise7 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);

        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.add("Cyan");
        newQueue.add("Green");
        newQueue.add("Purple");
        newQueue.add("White");
        newQueue.add("Grey");
        System.out.println("queue -> " + newQueue);

        for (String string : queue) {
            System.out.println("contains() -> " + (newQueue.contains(string) ? "Yes" : "No"));
        }

    }
}
