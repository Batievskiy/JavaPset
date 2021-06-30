// what is .substring() methods in Java?
// let's find out
public class SubstringsMethods {
    public static void main(String[] args) {
        System.out.println("---< .substring() methods in Java >---\n");

        // There are two variants of substring() method.

        // 1. .substring(startIndex) - returns a new string
        // that is a substring of this string from startIndex.
        System.out.println(".substring(startIndex) - returns a new string\n" +
                "that is a substring of this string from startIndex ->");
        String s1 = new String("hello world of Java");
        System.out.println("s1 -> " + s1);
        System.out.println("substring from index 6 -> " + s1.substring(6));
        System.out.println();

        // 2. .substring(startIndex, endIndex) - returns a new string
        // that is a substring of this string from startIndex to endIndex.
        System.out.println("2. .substring(startIndex, endIndex) - returns a new string\n" +
                "that is a substring of this string from startIndex to endIndex ->");
        System.out.println("s1 -> " + s1);
        System.out.println("substring from index 6 to 11 -> " + s1.substring(6, 11));
    }
}