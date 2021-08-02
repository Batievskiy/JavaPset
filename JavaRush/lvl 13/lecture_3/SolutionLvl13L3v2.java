// JavaRush lvl 13 lecture 3 problem
// recreate reverse() method using ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl13L3v2 {
//    public static int[] numbers = new int[10];
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
//        init();
//        print();
//
//        reverse();
//        print();

        initAL();
        printAL();

        reverseAL();
        printAL();
    }

//    public static void init() {
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = i;
//        }
//    }

    public static void initAL() {
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
    }

//    public static void reverse() {
//        int lenMinusOne = numbers.length - 1;
//        for (int i = 0; i < numbers.length; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[lenMinusOne - i];
//            numbers[lenMinusOne - i] = temp;
//        }
//    }

    public static void reverseAL() {
        int center = arrayList.size() / 2;
        Collections.reverse(arrayList);
    }

//    public static void print() {
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }

    public static void printAL() {
        for (int number : arrayList) {
            System.out.println(number);
        }
    }
}
