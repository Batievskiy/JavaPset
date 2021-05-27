import java.util.Arrays;

// how to pass values to methods?
// let's find out
public class AddressToMethod {

    // if method has objects as an arguments they passes addresses to values
    public static void fillArr(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public static void main(String[] args) {
        String[] data = new String[10];
        fillArr(data, "oops");
        System.out.println(Arrays.toString(data));

        // what is empty address?
        String name; // name == null right now
        // System.out.println(name); // but if you want to print it out - initialize first!
    }
}
