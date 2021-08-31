// Java Rush problem lvl 14 lecture 3
// change program using Collections

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class SolutionLvl14L3v1 {

//    public static void reverse(ArrayList<Integer> list) {
//        for (int i = 0, size = list.size() - 1; i < list.size() / 2; i++) {
//            Integer integer = list.get(i);
//            list.set(i, list.get(size - i));
//            list.set(size - i, integer);
//        }
//    }

    // changed reverse
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

//    public static void sort(ArrayList<Integer> list) {
//        int size = list.size();
//        int greater;
//        for (int i = 0; i < size; i++) {
//            for (int j = 1; j < (size - i); j++) {
//                if (list.get(j - 1) > list.get(j)) {
//                    greater = list.get(j - 1);
//                    list.set(j - 1, list.get(j));
//                    list.set(j, greater);
//                }
//            }
//        }
//    }

    // changed sort
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

//    public static void rotate(ArrayList<Integer> list, int distance) {
//        for (int i = 0; i < distance; i++) {
//            list.add(0, list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        }
//    }

    // changed rotate
    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

//    public static void shuffle(ArrayList<Integer> list) {
//        Random rand = new Random();
//        for (int i = 0; i < list.size(); i++) {
//            int randomIndexToSwap = rand.nextInt(list.size());
//            int temp = list.get(randomIndexToSwap);
//            list.set(randomIndexToSwap, list.get(i));
//            list.set(i, temp);
//        }
//    }

    // changed shuffle
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
