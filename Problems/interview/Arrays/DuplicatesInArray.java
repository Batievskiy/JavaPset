// let's find Duplicates in Array

import java.util.*;
import java.util.Map.Entry;

public class DuplicatesInArray {
    public static void main(String[] args) {
        System.out.println("---< Duplicates in Array >---\n");

        int[] arr = new int[]{0, 2, 2, 30, 5, 70, 44, 30};
        int len = arr.length;

        System.out.println("source array -> " + Arrays.toString(arr));
        System.out.println();

        System.out.println("0. using ArrayList ->");
        System.out.println("duplicates ->");
        arrDuplicates(arr);
        System.out.println();

        System.out.println("1. using HashSet ->");
        System.out.println("duplicates ->");
        System.out.println(hashSetDuplicates(arr));;
        System.out.println("\n");

        System.out.println("2. using HashMap ->");
        System.out.println("duplicates ->");
        hashMapDuplicates(arr, len);
        System.out.println();
    }

    // 0. using ArrayList
    private static void arrDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[j])) {
                    duplicates.add(arr[j]);
                }
            }
        }
        System.out.println(duplicates);
    }

    // 1. using HashSet
    private static Set<Integer> hashSetDuplicates(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int value : arr) {
            if (!hashSet.add(value)) {
                duplicates.add(value);
            }
        }
        return duplicates;
    }

    // 2. using HashMap
    private static void hashMapDuplicates(int[] arr, int len) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        boolean isDuplicate = false;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            // if frequency is more than 1 - print element
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                isDuplicate = true;
            }
        }
        // if no duplicates
        if (!isDuplicate) {
            System.out.println("-1");
        }
    }
}