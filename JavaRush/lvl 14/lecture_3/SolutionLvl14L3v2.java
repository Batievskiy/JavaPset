// JavaRush lvl 14 lecture 3 problem
// change program using Collections

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl14L3v2 {

//    public static Integer min(ArrayList<Integer> list) {
//        Integer min = list.get(0);
//        for (Integer integer : list) {
//            if (integer < min) {
//                min = integer;
//            }
//        }
//        return min;
//    }

    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

//    public static Integer max(ArrayList<Integer> list) {
//        Integer max = list.get(0);
//        for (Integer integer : list) {
//            if (integer < max) {
//                max = integer;
//            }
//        }
//        return max;
//    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

//    public static int frequency(ArrayList<Integer> list, Integer element) {
//        int frequency = 0;
//        if (element == null) {
//            for (Integer integer : list) {
//                if (integer == null) {
//                    frequency++;
//                }
//            }
//        } else {
//            for (Integer integer : list) {
//                if (integer.equals(element)) {
//                    frequency++;
//                }
//            }
//        }
//        return frequency;
//    }

    // changed frequency
    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

//    public static int binarySearch(ArrayList<Integer> list, Integer key) {
//        int low = 0;
//        int high = list.size() - 1;
//        int mid = (low + high) / 2;
//        int index = -1;
//        while (low <= high) {
//            if (list.get(mid) < key) {
//                low = mid + 1;
//            } else if (list.get(mid).equals(key)) {
//                index = mid;
//                break;
//            } else {
//                high = mid - 1;
//            }
//            mid = (low + high) / 2;
//        }
//        return index;
//    }

    // changed binarySearch
    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }
}
