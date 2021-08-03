// 1. Write a Java program
// to create a new priority queue,
// add some colors (string)
// and print out the elements of the priority queue.

import java.util.PriorityQueue;

public class PriorityQueueExercise1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("queue -> " + queue);
    }
}
