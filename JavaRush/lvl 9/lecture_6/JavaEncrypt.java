// let's Encrypt some data
import java.util.Arrays;

public class JavaEncrypt {
    public static void main(String[] args) {
        int[] someData = {1, 14, 6, 13, 7, 6, 11};
        int password = 177;

        // encrypt an array
        int[] encrypted = crypt(someData, password);
        System.out.println(Arrays.toString(encrypted));

        // and decrypt an array
        int[] decrypted = crypt(encrypted, password);
        System.out.println(Arrays.toString(decrypted));
    }

    // let's make a function to crypt data
    private static int[] crypt(int[] someData, int password) {
        int[] result = new int[someData.length];
        for (int i = 0; i < someData.length; i++) {
            result[i] = someData[i] ^ password;
        }
        return result;
    }
}
