import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,
                "Hello",
                ",",
                "Java",
                "World!");
        Collections.sort(arrayList, new StringLengthComparator());
        arrayList.forEach(System.out::println);
    }
}

// sorting strings by its length
class StringLengthComparator implements Comparator<String> {
    public int compare(String str1, String str2) {
        // In order to compare the length of strings, it is enough
        // to simply subtract one length from the other.
        return str1.length() - str2.length();
    }
}