import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,
                "Hello",
                ", ",
                "Java",
                "World!");

        // Anonymous class derived from Comparator
        // must either be declared abstract
        // or implements abstract method compare(T, T)
        Comparator<String> comparator = new Comparator<>() {
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        };

        Collections.sort(arrayList, comparator);
        arrayList.forEach(System.out::println);
    }
}
