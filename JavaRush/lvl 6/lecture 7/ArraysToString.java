import java.util.Arrays;

// printing out two arrays using toString methods
public class ArraysToString {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {

        // this method print out values in string format for strings, ints and other types
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));

    }
}
