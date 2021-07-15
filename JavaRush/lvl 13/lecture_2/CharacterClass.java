// what is Character Class in Java?
// let's find out
public class CharacterClass {
    // a wrapper class Character in java.lang package.
    // An object of type Character contains a single field, whose type is char.
    public static void main(String[] args) {
        System.out.println("---< Character Class in Java >---\n");
        // methods:
        // 1. .isAlphabetic(int codePoint) - determines if the specified character (Unicode code point) is an alphabet
        System.out.println("1. .isAlphabetic(int codePoint) - determines if the specified character (Unicode code point) is an alphabet ->");
        int codePoint = 89;
        boolean check = Character.isAlphabetic(codePoint);
        System.out.println(".isAlphabetic(89) -> " + check);
        if (check) {
            System.out.println("codePoint " + codePoint + " is alphabetic");
        } else {
            System.out.println("codePoint " + codePoint + " is not alphabetic");
        }
        System.out.println();

        // 2. .isLetter(char) - determine whether the specified char value(ch) is a letter or not
        System.out.println("2. .isLetter(char) - determine whether the specified char value(ch) is a letter or not ->");
        System.out.println("isLetter('A') -> " + Character.isLetter('A'));
        System.out.println();

        // 3. .idDigit(char) - determine whether the specified char value(ch) is a digit or not
        System.out.println(".idDigit(char) - determine whether the specified char value(ch) is a digit or not ->");
        System.out.println("isDigit('7') -> " + Character.isDigit('7'));
        System.out.println();

        // 4. .isSpaceChar(char) - determines if the specified character is a Unicode space character (codes: 12, 13, 14)
        System.out.println("4. .isSpaceChar(char) - determines if the specified character is a Unicode space character ->");
        System.out.println("isSpaceChar(' ') -> " + Character.isSpaceChar(' '));
        System.out.println();

        // 5. .isWhitespace(char) - determines whether the specified char value(ch) is white space
        System.out.println("5. .isWhitespace(char) - determines whether the specified char value(ch) is white space ->");
        System.out.println("isWhitespace(' ') -> " + Character.isWhitespace(' '));
        System.out.println();

        // 6. .isLowerCase(char) / .isUpperCase(char) - checks lowercase and uppercase chars
        System.out.println("6. .isLowerCase(char) / .isUpperCase(char) - checks lowercase and uppercase chars ->");
        System.out.println("isLowerCase('a') -> " + Character.isLowerCase('a')
                + "\nisUpperCase('Z') -> " + Character.isUpperCase('Z'));
        System.out.println();

        // 7. .toLowerCase(char) / toUpperCase(char) - converts chars to lower and upper case
        System.out.println("7. .toLowerCase(char) / toUpperCase(char) - converts chars to lower and upper case ->");
        System.out.println("toLowerCase('B') -> " + Character.toLowerCase('B')
                + "\ntoUpperCase('a') -> " + Character.toUpperCase('a'));
        System.out.println();
    }
}
