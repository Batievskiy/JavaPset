import java.util.Arrays;

// what is .split() method in Java?
// let's find out
public class SplitMethod {
    public static void main(String[] args) {
        System.out.println("---< .split() method in Java >---\n");
        // there are the two variants of split() method in Java

        // 1. .split(RegEx) - breaks a given string around matches
        // of the given regular expression.
        String s1 = new String("hello-Java-world");
        System.out.println("1. .split(RegEx) - breaks a given string around matches\n" +
                "of the given regular expression ->");
        System.out.println("splitted strings -> " + Arrays.toString(s1.split("-")));
        System.out.println();

        // 2. .split(RegEx, limit) - breaks a given string around matches
        // of the given regular expression limiting how much strings to return
        System.out.println("2. .split(RegEx, limit) - breaks a given string around matches\n" +
                "of the given regular expression limiting how much strings to return ->");
        System.out.println("splitted strings -> " + Arrays.toString(s1.split("-", 2)));
        System.out.println();
    }
}
