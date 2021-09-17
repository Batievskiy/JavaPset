// create two methods:
// public static getStreamFromArrayList()
// - to return stream of Strings from list as argument.
// public static getStreamFromArray()
// - to return stream of Integers from array as argument

// hint:
// to get a stream from the collection, we have to call the method .stream()
// to get a stream from the array, we have to call .stream(array)

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SolutionLvl19L3v0 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Winter", "Spring", "Summer", "Fall");

        Stream<String> streamString = getStreamFromArrayList(strings);
        streamString.forEach(System.out::println);

        var integers = new Integer[] {12, 34, 56, 78, 90};
        Stream<Integer> streamInteger = getStreamFromArray(integers);
        streamInteger.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        return list.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        return Arrays.stream(array);
    }
}
