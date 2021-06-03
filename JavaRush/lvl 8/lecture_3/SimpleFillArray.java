import java.util.Arrays;
import java.util.stream.IntStream;

// primitive problem from JvaRush
// create and fill in array in different method
public class SimpleFillArray {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        // simplest way actually do the same
        // IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }
}
