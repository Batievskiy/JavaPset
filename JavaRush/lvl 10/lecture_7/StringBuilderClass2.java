// what is StringBuilder Class in Java?
// let's find out part.2
public class StringBuilderClass2 {
    public static void main(String[] args) {
        System.out.println("---< StringBuilder Class in Java part.2 >---\n");
        // The StringBuilder in Java represents a mutable sequence of characters.

        /* here is four Constructors:

            StringBuilder():
            Constructs a string builder with no characters in it
            and an initial capacity of 16 characters.

            StringBuilder(int capacity):
            Constructs a string builder with no characters in it
            and an initial capacity specified by the capacity argument.

            StringBuilder(CharSequence seq):
            Constructs a string builder that contains the same characters
            as the specified CharSequence.

            StringBuilder(String str):
            Constructs a string builder initialized to the contents
            of the specified string.
        */

        // 7. .indexOf("substring") - finds substring in String
        System.out.println("7. .indexOf(\"substring\", index) - finds substring in String ->");
        StringBuilder sb7 = new StringBuilder();
        sb7.append("hello JAVA world");
        System.out.println("sb7 -> " + sb7);
        System.out.println("index of \"JAVA\" -> " + sb7.indexOf("JAVA"));
        System.out.println();

        // 8. .lastIndexOf("substring") - finds substring from the end of a String
        System.out.println("8. .lastIndexOf(\"substring\") - finds substring from the end of a String ->");
        StringBuilder sb8 = new StringBuilder();
        sb8.append("one two three one two three");
        System.out.println("sb8 -> " + sb8);
        System.out.println("index of \"two\" from end -> " + sb8.lastIndexOf("two"));
        System.out.println();

        // 9. .charAt(index) - returns char at given index
        System.out.println("9. .charAt(index) - returns char at given index ->");
        StringBuilder sb9 = new StringBuilder();
        sb9.append("let's find char -> X <- in this string");
        System.out.println("sb9 -> " + sb9);
        System.out.println("char at index 19 -> " + sb9.charAt(19));
        System.out.println();

        // 10. .substring(startIndex, endIndex) - returns substring in range of indexes
        System.out.println("10. .substring(startIndex, endIndex) - returns substring in range of indexes ->");
        StringBuilder sb10 = new StringBuilder();
        sb10.append("let's take this $TEXT$ from string");
        System.out.println("sb10 -> " + sb10);
        System.out.println("substring -> " + sb10.substring(16, 22));
        System.out.println();

        // 11. .setCharAt(index, 'char') - change char at given index to a new char
        System.out.println("11. .setCharAt(index, 'char') - change char at given index to a new char ->");
        StringBuilder sb11 = new StringBuilder();
        sb11.append("let's change chars in this string");
        System.out.println("sb11 -> " + sb11);
        sb11.setCharAt(8, '^');
        sb11.setCharAt(15, '^');
        sb11.setCharAt(24, '^');
        sb11.setCharAt(30, '^');
        System.out.println("changed chars -> " + sb11);
        System.out.println();

        // 12. .length() - returns length of a string
        System.out.println("12. .length() - returns length of a string ->");
        StringBuilder sb12 = new StringBuilder();
        sb12.append("length of this string is tooo looong");
        System.out.println("sb12 -> " + sb12);
        System.out.println("length of sb12 -> " + sb12.length());
    }
}
