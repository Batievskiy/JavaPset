import java.util.Arrays;

// What is String Class in Java?
// let's find out part.1
public class StringBasicsPart1 {

    // String is a sequence of characters
    // In Java, objects of String are immutable
    // - which means a constant and cannot be changed once created

    public static void main(String[] args) {
        System.out.println("---< String Class in Java >---\n");
        // Creating a String literal
        String s1 = "I am String One";

        // Creating a String using "new" keyword
        String s2 = new String ("and I am String Two");

        // Basic methods:
        // 1. int .length() - returns the number of characters present in the string
        System.out.println("1. int .length() - returns the number of characters present in the string ->");
        System.out.println("length of a String One -> " + s1.length());
        System.out.println();

        // 2. boolean .isEmpty() - check whether a String is empty or not
        // an returns True or False
        System.out.println("2. boolean .isEmpty() - check whether a String is empty or not ->");
        System.out.println("is String Two empty? -> " + s2.isEmpty());
        System.out.println();

        // 3. boolean .isBlank() - check whether a String is empty or contains only whitespace code points
        // an returns True or False
        String s3 = " "; // white space string
        System.out.println("3. boolean .isBlank() - check whether a String is empty or contains only whitespace code points ->");
        System.out.println("is String One empty or has only whitespace? -> " + s3.isBlank());
        System.out.println();

        // 4. char .charAt(int index) - returns char at index'th position of a String
        // index value should lie between 0 and length() - 1
        System.out.println("4. char .charAt(int index) - returns char at index'th position of a String ->");
        System.out.println("string one -> " + s1);
        System.out.println("char at 3rd position is -> " + s1.charAt(3));
        System.out.println();

        // 5. char[] .toCharArray() - returns an Array of chars from String
        // the returned array length is equals to length of a string
        System.out.println("5. char[] .toCharArray() - returns an Array of chars from String ->");
        char[] s1Copy = s1.toCharArray();
        System.out.println("String One -> " + s1);
        System.out.println("array from String One -> " + Arrays.toString(s1Copy));
        System.out.println();

        // 6. byte[] .getBytes() - convert a String into sequence of bytes and returns an Array of bytes
        System.out.println("6. byte[] .getBytes() - convert a String into sequence of bytes and returns an Array of bytes ->");
        byte[] byteString = s2.getBytes();
        System.out.println("String Two -> " + s2);
        System.out.println("Byte array from String Two -> " + Arrays.toString(byteString));
        System.out.println();

        // 7. String[] .split(String regex) - divides a String using RegEx to substrings and returns an Array of strings
        // breaks a given string around matches of the given regular expression
        // Returns an Array of strings computed by the given string
        String s4 = "Hello World & Keep Learning";
        System.out.println("7. String[] .split(String regex) - divides a String using RegEx" +
                "\nto substrings and returns an Array of strings ->");
        String[] arrOfStr = s4.split("&");
        System.out.println("String 4 -> " + s4);
        System.out.println("Array from String 4 -> " + Arrays.toString(arrOfStr));
        System.out.println();

        // 8. String .join(CharSequence delimiter, str1, str2, ..., strN) - join substrings in one String
        System.out.println("8. String .join(CharSequence delimiter, str1, str2, ..., strN) - join substrings in one String ->");
        System.out.println("String One -> " + s1);
        System.out.println("String Two -> " + s2);
        String joinedString = String.join(" & ", s1, s2, s3, s4);
        System.out.println("joined String -> " + joinedString);
        System.out.println();
    }
}
