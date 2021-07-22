// JavaRush lvl 11 lecture 6 problem
// create executeDefragmentation(String[] array)
// to move null elements to the end of the array
import java.util.Arrays;
public class MemoryJR {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int arrayLength = array.length;
        String[] result = new String[arrayLength];
        int i = 0;
        for (String string : array) {
            if (string != null) {
                result[i] = string;
                i++;
            }
        }
        System.arraycopy(result, 0, array, 0, arrayLength);
    }
}
