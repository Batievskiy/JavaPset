import java.util.PriorityQueue;

// 11. Write a Java program
// to convert a Priority Queue elements
// to a string representation.
public class PriorityQueueExercise11 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.add("one");
        pQueue.add("two");
        pQueue.add("three");
        pQueue.add("four");
        pQueue.add("five");
        System.out.println("pQueue -> " + pQueue);
        System.out.println();

        // convert t String
        String str1 = pQueue.toString();
        System.out.println(".toString() -> " + str1);


    }
}
