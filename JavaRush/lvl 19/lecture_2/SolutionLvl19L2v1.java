// recreate method print(ArrayList<String>) using for loop

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl19L2v1 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", ", ", "Java", " ", "World");

        print(strings);
    }

    // TODO - recreate method print(ArrayList<String>) using for loop
//    public static void print(ArrayList<String> strings) {
//        strings.forEach(string -> System.out.println(string));
//    }
    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
