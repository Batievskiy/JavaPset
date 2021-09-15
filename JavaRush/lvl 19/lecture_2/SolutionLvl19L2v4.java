// in method toStringArray():
// - convert the list of strings to an array of strings and return it.
// in method toIntegerArray():
// - covert the list of integers to an array of integers and return it.
// using toArray() method

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl19L2v4 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "You", " ", "are", " ", "programmer!");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);

        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    // TODO - convert the list of strings to an array of strings and return it.
    public static String[] toStringArray(ArrayList<String> strings) {
        return strings.toArray(String[]::new);
    }

    // TODO - covert the list of integers to an array of integers and return it.
    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        return integers.toArray(Integer[]::new);
    }
}
