// what is .matches methods in Java?
// let's find out
public class StringMatchesMethods {
    public static void main(String[] args) {
        System.out.println("---< .matches methods in Java >---");

        // There are three variants of matches() method.



        // 1. .matches() - tells whether or not this string
        // matches the given regular expression.
        System.out.println("1. .matches() - tells whether or not this string\n" +
                "matches the given regular expression ->");
        String s1 = new String("Hello world of Java");
        System.out.println("is \"world\" matches? -> " + s1.matches("(.*)world(.*)"));
        System.out.println();

        // 2. .regionMatches(ignoreCase, toffset, "string2", ooffset, length) (with ignoreCase) - has two variants which can be used to test
        // if two string regions are equal.
        System.out.println("2. .regionMatches() (with ignoreCase) - has two variants which can be used to test\n" +
                "if two string regions are equal ->");
        String s2 = new String("hello");
        System.out.println(s1.regionMatches(true, 0, s2, 0, 5));
        System.out.println();

        // 3. .regionMatches(toffset, "string2", ooffset, length) - has two variants which can be used to test
        // if two string regions are equal.
        System.out.println("3. .regionMatches() (with ignoreCase) - has two variants which can be used to test\n" +
                "if two string regions are equal ->");
        System.out.println(s1.regionMatches(0, s2, 0, 5));
        System.out.println();
    }
}
