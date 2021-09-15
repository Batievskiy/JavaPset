// recreate method print(ArrayList<String>) using method reference

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl19L2v2 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", ", ", "Java", " ", "World");

        print(strings);
    }

    // TODO - recreate method print(ArrayList<String>) using method reference
//    public static void print(ArrayList<String> strings) {
//        strings.forEach(string -> System.out.println(string));
//    }

    public static void print(ArrayList<String> strings) {
        strings.forEach(System.out::println);
    }
}
