// recreate method print(ArrayList<String>) using lambda expression


import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl19L2v3 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    // TODO - recreate method print(ArrayList<String>) using lambda expression
//    public static void print(ArrayList<Integer> numbers) {
//        numbers.forEach(System.out::println);
//    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(n -> System.out.println(n));
    }
}