import java.util.Arrays;
import java.util.Scanner; // DON'T FORGET to CLOSE SCANNER!!!

// how to search through array?
// ask user for array Size and fill it wth random numbers from 0 to 99
public class SearchInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size: ");
        int arrSize = sc.nextInt();

        int[] array = new int[arrSize];
        randomiZer(array);
        System.out.println("array before sorting: " + Arrays.toString(array));

        // ask user for element to find in array from 0 to 99
        System.out.print("number to find: ");
        int findN = sc.nextInt();

        Arrays.sort(array);
        System.out.println("array after sorting: " + Arrays.toString(array));

        int isFind = Arrays.binarySearch(array, findN);

        if (isFind > 0) {
            System.out.println("number " + findN + " index is: " + isFind);
        } else {
            System.out.println(findN + " is not found");
        }
        sc.close();
    }

    // simple random filler
    static void randomiZer(int[] arr) {
        for (int i = 0, len = arr.length; i < len; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }
}
