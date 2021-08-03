// 2. Write a Java program
// to iterate through all elements in priority queue.

import java.util.PriorityQueue;

public class PriorityQueueExercise2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.print("queue -> ");

        for (String string : queue) {
            System.out.print(string);
            System.out.print(", ");
        }
    }
}
