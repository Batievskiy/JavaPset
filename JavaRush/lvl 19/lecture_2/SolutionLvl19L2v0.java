// recreate print(ArrayList<Integer>) using forEach()

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl19L2v0 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    // TODO - recreate print(ArrayList<Integer>) using forEach()
//    public static void print(ArrayList<Integer> numbers) {
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//    }
    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(string -> System.out.println(string));
    }
}
