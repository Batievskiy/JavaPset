// JavaRush lvl 13 lecture 7
// why does Patterns (Collections) exist in Java?
// let's find out

import java.util.ArrayList;

public class PatternsCollectionsJR {
    public static void main(String[] args) {
        // example 1:
        // he had to use Casting on object of different types
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i * 10);
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + (Integer) integers.get(i); // <--- casting to Integer in not necessary
        }

        // example 2:
        ArrayList<Double> doubles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            doubles.add(i * 2.5);
        }

        for (int i = 0; i < 10; i++) {
            // sum += (Integer) doubles.get(i); // <--- error - can't Cast Double on Integer
            sum += (Double) doubles.get(i); // we have to use Casting on object
        }
    }
}
