// what is String Literals in Java?
// let's find out
public class StringLiterals {
    public static void main(String[] args) {
        System.out.println("---< String Literals in Java >---");
        // Literal - > any value
        // which can be assigned to the variable
        // is called as literal/constant

        // Any sequence of characters within double quotes is treated as String literals
        // String literals may not contain unescaped newline or linefeed characters
        // we can specify String literals using "":

        String s = "What sup?";

        System.out.println("String literals using \"\""
                + "\nString s = \"What sup?\";"
                + "\n---< " + s);
    }
}
