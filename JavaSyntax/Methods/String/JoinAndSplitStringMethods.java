// what is .join() and .split() methods in Java?
// let's find out
import java.util.*;
public class JoinAndSplitStringMethods {
    public static void main(String[] args) {
        System.out.println("---< .join() and .split() methods in Java >---\n");

        // 1 .join(delimiter, CharSequence...elements) - joins strings into one String
        System.out.println("1 .join(delimiter, CharSequence...elements) - joins strings into one String ->");
        List<String> people = Arrays.asList(
                "John",
                "Sarah",
                "T800",
                "T1000",
                "SkyNet"
        );
        String peopleString = String.join(" & ", people);
        System.out.println(peopleString);
        System.out.println();

        // 2. We can also join like this - delimiter, s1, s2, s3, ... sN
        System.out.println("2. We can also join like this - delimiter, s1, s2, s3, ... sN  ->");
        String s1 = "Hello";
        String s2 = "Java";
        String s3 = "World";
        String hJw = String.join(" ", s1, s2, s3);
        System.out.println(hJw);
        System.out.println();

        // 3. .split("RegEx") - splits String on small pieces using Regular Expression as delimiter
        System.out.println("3. .split(\"RegEx\") - splits String on small pieces using Regular Expression as delimiter ->");
        System.out.println("peopleString -> " + peopleString);
        String[] pArr = peopleString.split(" & ");
        System.out.println("split on \" & \" ->");
        for (String value : pArr) {
            System.out.println(value);
        }
        System.out.println();
    }
}
