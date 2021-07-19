// 13. Write a Java program to compare two array lists.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise13 {
    public static void main(String[] args) {
        ArrayList<String> arls = new ArrayList<>();
        arls.add("hello");
        arls.add(" - ");
        arls.add("java");
        arls.add("world");
        arls.add("!");
        System.out.println("arls -> " + arls);

        ArrayList<String> copyArls = new ArrayList<>(arls);
        copyArls.set(3, "oops");

        ArrayList<String> compare = new ArrayList<>();
        for (String string : arls) {
            compare.add(copyArls.contains(string) ? "Yes" : "No");
        }
        System.out.println("compared -> " + compare);
    }
}
