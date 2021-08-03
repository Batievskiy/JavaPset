// 6. Write a Java program
// to count the number of elements in a priority queue.

import java.util.PriorityQueue;

public class PriorityQueueExercise6 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);

        System.out.println(".size() -> " + queue.size());
    }
}
