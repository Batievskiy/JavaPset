// JavaRush lvl 14 lecture 1 problem
// create arrayToHashSet() method converting an array to HashSet

import java.util.Collections;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SolutionLvl14L1v0 {
    public static void main(String[] args) {
        String[] array = {"Hello", "Java", "World"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("_____________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String string : hashSet) {
            System.out.println(string);
        }
    }

    // way 0 - using simple for loop:
//    public static HashSet<String> arrayToHashSet(String[] array) {
//        HashSet<String> result = new HashSet<>(array.length);
//        for (int i = 0; i < array.length; i++) {
//            result.add(array[i]);
//        }
//        return result;
//    }

    // way 1 - using for-each loop:
//    public static HashSet<String> arrayToHashSet(String[] array) {
//        HashSet<String> result = new HashSet<>(array.length);
//        for (String s : array) {
//            result.add(s);
//        }
//        return result;
//    }

    // way 2 - using Arrays.asList():
//    public static HashSet<String> arrayToHashSet(String[] array) {
//        return new HashSet<>(Arrays.asList(array));
//    }

    // way 3 - using Arrays.stream().collect(Collectors.toSet())
//    public static HashSet<String> arrayToHashSet(String[] array) {
//        HashSet<String> result = new HashSet<>();
//        result = (HashSet) Arrays.stream(array).collect(Collectors.toSet());
//        return result;
//    }

    // way 4 - using .toArray()
//    public static HashSet<String> arrayToHashSet(String[] array) {
//        HashSet<String> result = new HashSet<>();
//        result.toArray();
//        return result;
//    }

    // way 5 - using Collections.addAll():
    public static HashSet<String> arrayToHashSet(String[] array) {
        HashSet<String> result = new HashSet<>(array.length);
        Collections.addAll(result, array);
        return result;
    }
}
