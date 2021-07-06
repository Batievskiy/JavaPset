import java.util.StringTokenizer;
import java.util.Arrays;

// Java Rush lvl 10 lecture 6
// using StringTokenizer split query onto parts by delimiter
// max tokens available - 6
public class StringTokenizerJavaRush {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[6]; // six tokens available
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;
    }
}
