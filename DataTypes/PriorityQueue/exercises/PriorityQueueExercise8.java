// 8. Write a Java program
// to retrieve the first element of the priority queue.

import java.util.PriorityQueue;

public class PriorityQueueExercise8 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);

        System.out.println(".peek() -> " + queue.peek());
    }
}
