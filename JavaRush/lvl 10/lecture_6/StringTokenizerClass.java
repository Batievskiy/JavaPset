import java.util.StringTokenizer;

// what is StringTokenizer in Java?
// let's find out
public class StringTokenizerClass {
    public static void main(String[] args) {
        System.out.println("---< StringTokenizer in Java >---\n");

        // StringTokenizer class in Java is used to break a string into tokens.

        // 1. .StringTokenizer("String") - breaks a string eliminating all delimiters (as default)
        System.out.println("1. .StringTokenizer(\"String\") - breaks a string eliminating all delimiters (as default) ->");
        StringTokenizer tkn1 = new StringTokenizer("hello Java world");
        while (tkn1.hasMoreTokens()) {
            System.out.println("token -> " + tkn1.nextToken());
        }
        System.out.println();

        // 2. .StringTokenizer("String", "delimiter") - breaks a string and removes specified delimiter
        System.out.println("2. .StringTokenizer(\"String\", \"delimiter\") - breaks a string and removes specified delimiter ->");
        StringTokenizer tkn2 = new StringTokenizer("hello; Java; world;", "; ");
        while (tkn2.hasMoreTokens()) {
            System.out.println("token -> " + tkn2.nextToken());
        }
        System.out.println();

        // 3. .StringTokenizer("String", "delimiter", boolean flag) - breaks a string and returns specified delimiter
        System.out.println("2. .StringTokenizer(\"String\", \"delimiter\") - breaks a string and removes specified delimiter ->");
        StringTokenizer tkn3 = new StringTokenizer("hello ! Java ! world !", "!", true);
        while (tkn3.hasMoreTokens()) {
            System.out.println("token -> " + tkn3.nextToken());
        }
        System.out.println();
    }
}
