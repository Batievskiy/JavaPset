import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// how to merge an arrays?
// let's play with it a little
public class MergeArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("initial array size: ");

        int size = sc.nextInt(); // size of arrays from user
        sc.nextLine();

        int[] firstArr = new int[size];
        int[] secondArr = new int[size];

        String fill;
        do {
            System.out.print("fill first array with: ( random / fibonacci) ");
            fill = sc.nextLine();
        } while (!fill.equals("random") && !fill.equals("fibonacci"));

        if (fill.equals("random")) {
            random(firstArr); // filling the array with random numbers
        } else {
            fibonacci(firstArr); // filling the array with fibonacci numbers
        }

        do {
            System.out.print("fill second array with: ( random / fibonacci) ");
            fill = sc.nextLine();
        } while (!fill.equals("random") && !fill.equals("fibonacci"));


        if (fill.equals("random")) {
            random(secondArr); // filling second array with random numbers
        } else {
            fibonacci(secondArr); // filling second array with fibonacci numbers
        }

        System.out.println(fill + " firstArr: " + Arrays.toString(firstArr));

        System.out.println(fill + " secondArr: " + Arrays.toString(secondArr));

        // so we have two arrays - let's mix them together in new array
        int[] mergedArr = new int[size * 2]; // create new array length of both arrays
        // copy first array to cpyArr
        System.arraycopy(firstArr, 0, mergedArr, 0, firstArr.length);
        // copy second array to cpyArr
        System.arraycopy(secondArr, 0, mergedArr, firstArr.length, secondArr.length);
        System.out.println("merged: " + Arrays.toString(mergedArr));

        // merging first and second arrays partially
        int[] destArr = new int[size * 2 + 1];
        // taking two numbers from each array, skipping one zero and repeat
        System.arraycopy(secondArr, 0, destArr, 0, 2);
        System.arraycopy(firstArr, 0, destArr, 3, 2);
        System.arraycopy(secondArr, 2, destArr, 6, 2);
        System.arraycopy(firstArr, 3, destArr, 9, 2);

        System.out.println("partially merged: " + Arrays.toString(destArr));

        // how to copy arrays another way?
        // using for loop:
        int index = 0;
        // copying all elements of first array
        for (int element : firstArr) {
            destArr[index] = element;
            index++;
        }
        // copying all elements of second array
        for (int element : secondArr) {
            destArr[index] = element;
            index++;
        }

        System.out.println("for loop merged: " + Arrays.toString(destArr));

        // copy arrays with Collections
        // let's try this out

        String[] str1 = {"W", "E", "L", "C", "O", "M", "E"};
        String[] str2 = {" ", "H","O","M","E"};

        List mergeList = new ArrayList(Arrays.asList(str1));

        mergeList.addAll(Arrays.asList(str2));

        Object[] str3 = mergeList.toArray();

        System.out.println(Arrays.toString(str3));

        sc.close();
    }

    // lets make random filler function for a fun
    static void random(int[] rand) {
        for (int i = 0, len = rand.length; i < len; i++) {
            rand[i] = (int) (Math.random() * 100);
        }
    }

    // lets make fibonacci filler function for a fun
    static void fibonacci(int[] fibos) {
        fibos[0] = 1;
        fibos[1] = 1;
        for (int i = 2, len = fibos.length; i < len; i++) {
            fibos[i] = fibos[i - 1] + fibos[i - 2];
        }
    }


}