import java.util.Arrays;

// What is String Class in Java?
// let's find out part.2
public class StringBasicsPart2 {

    // String is a sequence of characters
    // In Java, objects of String are immutable
    // - which means a constant and cannot be changed once created

    public static void main(String[] args) {
        System.out.println("---< String Class in Java >---\n");
        // Creating a String literal
        String s1 = "I am String One";
        // Creating a String using "new" keyword
        String s2 = new String ("and I am String Two");
        String s3 = " "; // white space string

        // Basic methods part.2:
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

        // 9. String .intern() - Set a String into a String Constant Pool (but not in heap)
        System.out.println("9. String .intern() - Set a String into a String constant pool (but not in heap) ->");
        // string allocated in Heap
        String hello1 = new String("hello");
        System.out.println("string in Heap -> " + hello1);
        // string allocated in Constant Pool
        String hello2 = new String("hello").intern();
        System.out.println("string in Pool -> " + hello2);
        System.out.print("does this two strings equal? -> ");
        System.out.println(hello1 == hello2);

        // 10.
    }
}