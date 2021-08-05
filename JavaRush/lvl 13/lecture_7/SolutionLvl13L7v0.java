// JavaRush lvl 13 lecture 7 problem
// create checkElementType(ArrayList<Object>) to check type of elements in the list
// - printString()
// - printInteger()
// - printIntegerArray()
// - printUnknown()

import java.util.ArrayList;

public class SolutionLvl13L7v0 {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("hello");
        elements.add(77);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (Object element : elements) {
            if (element instanceof String) {
                printString();
            } else if (element instanceof Integer) {
                printInteger();
            } else if (element instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("String!");
    }

    public static void printInteger() {
        System.out.println("Integer!");
    }

    public static void printIntegerArray() {
        System.out.println("IntegerArray!");
    }

    public static void printUnknown() {
        System.out.println("UNKNOWN!");
    }
}
