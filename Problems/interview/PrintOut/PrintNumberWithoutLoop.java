// Interview tricky question
// print from start to end without any loop

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 10;

        // Way 1 - using recursive function
        System.out.println("Way 1 - using recursive function ->");
        printNum(startNumber, endNumber);
        System.out.println();

        // Way 2 - using Java streams
        // IntStream.range(startNumber, endNumber + 1).forEach(e -> System.out.println(e));
        IntStream.range(startNumber, endNumber + 1).forEach(System.out::println);
    }

    // using recursive function
    private static void printNum(int startN, int endN) {
        if (startN <= endN) {
            System.out.println(startN);
            startN++;
            printNum(startN, endN);
        }
    }
}