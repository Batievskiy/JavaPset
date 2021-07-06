import java.util.*;

// How to find intersection in the Array in Java?
// let's find out
public class ArrayIntersection {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{2, 3, 4, 5, 6, 7, 8, 0};
        Integer[] arr2 = new Integer[]{1, 3, 5, 7, 9};
        intersect(arr1, arr2);

        int[] num1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] num2 = new int[]{4, 6, 9, 12};


        System.out.println(Arrays.toString(inSect(num1, num2)));

    }

    // using three HashSets
    private static void intersect(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        HashSet<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);
    }

    // using HashSets but in separate methods
    private static int[] inSect(int[] num1, int[] num2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int value : num1) {
            set1.add(value);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int value : num2) {
            set2.add(value);
        }
        if (set1.size() < set2.size()) return setInter(set1, set2);
        else return setInter(set2, set1);
    }
    private static int[] setInter(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] output = new int[set1.size()];
        int index = 0;
        for (Integer value : set1) {
            if (set2.contains(value)) output[index++] = value;
        }
        return Arrays.copyOf(output, index);
    }
}