import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressions {
    /* Enable to treat functionality as a method argument, or code as data.
     * A function that can be created without belonging to any class.
     * A lambda expressions can be passed around
     * as if it was an object and executed on demand.
     *
     * Lambda expressions can be written only for one method interfaces
     */

    public static void main(String[] args) {
        // regular version
        Comparator<String> comparator = new Comparator<>() {
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        };

        // short lambda version:
        Comparator<String> stringLengthComparator = (String str1, String str2) -> {
            return str1.length() - str2.length();
        };

        // shortest version using Comparator.comparingInt();
        Comparator<String> comparingInt = Comparator.comparingInt(String::length);

        // regular version
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,
                "Hello",
                ", ",
                "Java",
                "World!");
        Collections.sort(arrayList, comparator);

        // short lambda version:
        Collections.sort(arrayList, (String str1, String str2) -> {
            return str1.length() - str2.length();
        });

        // shortest version:
        Collections.sort(arrayList, Comparator.comparingInt(String::length));

        // Type inference
        Comparator<String> comparatorInference = (str1, str2) ->
                str1.length() - str2.length();
        Collections.sort(arrayList, comparatorInference);

        Collections.sort(arrayList, (str1, str2) -> str1.length() - str2.length());
    }
}
