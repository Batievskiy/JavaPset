import java.util.ArrayList;
import java.util.Collections;

// JavaRush lvl 14 lecture 3 problem
// create program to copy, add and replace elements in ArrayList
// using Collections
public class SolutionLvl14L3v1 {
    public static void main(String[] args) {

    }

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
//        int sourceSize = source.size();
//        if (destination.size() < sourceSize) {
//            throw new IndexOutOfBoundsException("Source does not fir it destination");
//        }
//        for (int i = 0; i < sourceSize; i++) {
//            destination.set(i, source.get(i));
//        }
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
//        for (String string : strings) {
//            list.add(string);
//        }
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
//        int listSize = list.size();
//        for (int i = 0; i < listSize; i++) {
//            String string = list.get(i);
//            if (string.equals(oldValue)) {
//                list.set(i, newValue);
//            }
//        }
        Collections.replaceAll(list, oldValue, newValue);
    }

}
