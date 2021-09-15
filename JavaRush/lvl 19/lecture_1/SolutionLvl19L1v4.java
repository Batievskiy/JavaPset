import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SolutionLvl19L1v4 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    // TODO - recreate the method without lambda (create class StringComparator)
//    public static void sortStringsByLength(ArrayList<String> strings) {
//        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
//    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
