// what is Char Literals in Java?
// let's find out
public class CharLiterals {
    public static void main(String[] args) {
        System.out.println("---< Char Literals in Java >---");
        // Literal - > any value
        // which can be assigned to the variable
        // is called as literal/constant

        // For char data types we can specify literals in four ways:

        // Single quote '
        char ch1 = 'a';

        // Char literals a Integral literals (0-65535)
        char ch2 = 97;

        // Unicode representation (\\uxxxx) hexadecimal numbers
        char ch3 = '\u0061';

        // Escape sequence
        // every escape character can be specify as char literals
        char ch4 = '\n'; // new line char

        System.out.println("Single quote '"
                + "\nchar ch1 = 'a';"
                + "\n---< " + ch1);
        System.out.println("Char literals a Integral literals (0-65535)"
                + "\nchar ch2 = 97;"
                + "\n---< " + ch2);
        System.out.println("Unicode representation (\\uxxxx) hexadecimal numbers"
                + "\nchar ch3 = '\\u0061';"
                + "\n---< " + ch3);
        System.out.println("Escape sequence"
                + "\nchar ch4 = '\\n';"
                + "\n---< " + ch4);
    }
}
