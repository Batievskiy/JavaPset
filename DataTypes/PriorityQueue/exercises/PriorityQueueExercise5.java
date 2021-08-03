// 5. Write a Java program
// to remove all the elements from a priority queue

import java.util.PriorityQueue;

public class PriorityQueueExercise5 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);

        queue.clear();
        System.out.println(".clear() -> " + queue);
    }
}
