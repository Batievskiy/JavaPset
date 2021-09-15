// method sortNumbers(ArrayList<Integer>) - sorting a list
// - using Collections.sort(ArrayList<Integer>, Comparator<Integer>)

// recreate the method sortNumbers(ArrayList<Integer>) using lambda expression

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SolutionLvl19L1v3 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    // TODO - recreate using lambda expression
//    public static void sortNumbers(ArrayList<Integer> numbers) {
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1 - i2;
//            }
//        };
//        Collections.sort(numbers, comparator);
//    }
    public static void sortNumbers(ArrayList<Integer> numbers) {
        Collections.sort(numbers, (i1, i2) -> i1 - i2);
    }
}
