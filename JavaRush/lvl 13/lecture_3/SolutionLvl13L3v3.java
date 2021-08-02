// JavaRush lvl 13 lecture 3 problem
// recreate bubble sort using int[] numbers instead ArrayList

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionLvl13L3v3 {

//    public static ArrayList<Integer> numbers = new ArrayList<>(
//            Arrays.asList(23, 45, 56, 67, 98, -34, -1, 12, 31, 51)
//    );

    public static int[] numbers2 = new int[]{18, -33, 56, 71, -97, 22, 46, 62, 85, 0};

    public static void main(String[] args) {
//        print();
//        sort();
//        System.out.println("\nsorted -> ");
//        print();
//
//        System.out.println("\n-----\n");

        print2();
        sort2();
        System.out.println("\nsorted -> ");
        print2();


    }

//    public static void sort() {
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            for (int j = 0; j < numbers.size() - i - 1; j ++) {
//                if (numbers.get(j) > numbers.get(j + 1)) {
//                    int temp = numbers.get(j);
//                    numbers.set(j, numbers.get(j + 1));
//                    numbers.set(j + 1, temp);
//                }
//            }
//        }
//    }

    public static void sort2() {
        for (int i = 0; i < numbers2.length - 1; i++) {
            for (int j = 0; j < numbers2.length - i - 1; j++) {
                if (numbers2[j] > numbers2[j + 1]) {
                    int temp = numbers2[j];
                    numbers2[j] = numbers2[j + 1];
                    numbers2[j + 1] = temp;
                }
            }
        }
    }

//    public static void print() {
//        for (int number : numbers) {
//            System.out.print(number + "\t");
//        }
//    }

    public static void print2() {
        for (int number : numbers2) {
            System.out.print(number + "\t");
        }
    }
}
