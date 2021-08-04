// 10. Write a Java program
// to convert a priority queue to an array
// containing all of the elements of the queue.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueExercise10 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        pQueue.add("one");
        pQueue.add("two");
        pQueue.add("three");
        pQueue.add("four");
        pQueue.add("five");
        System.out.println("pQueue -> " + pQueue);
        System.out.println();

        //conversion to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(pQueue);
        System.out.println("arrayList -> " + arrayList);
        System.out.println();

        // conversion to primitive array
        int pQueueSize = pQueue.size();
        String[] arrayString = new String[pQueue.size()];
        for (int i = 0; i < pQueueSize; i ++) {
            arrayString[i] = pQueue.poll();
            System.out.println("arrayString -> " + Arrays.toString(arrayString));
            System.out.println("pQueue -> " + pQueue);
        }


    }
}
