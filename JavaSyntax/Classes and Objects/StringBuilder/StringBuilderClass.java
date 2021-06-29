// what is StringBuilder Class in Java?
// let's find out part.1
public class StringBuilderClass {
    public static void main(String[] args) {
        System.out.println("---< StringBuilder Class in Java pert.1 >---\n");
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

        StringBuilder sb1 = new StringBuilder();

        // 1. .append(x) - appends the string representation of X type to sequence
        System.out.println("1. .append(x) - appends the string representation of X type to sequence ->");
        sb1.append("hello world");
        System.out.println("sb1 -> " + sb1);
        sb1.append(" of Java");
        System.out.println("sb1 -> " + sb1);
        System.out.println();

        // 2. .reverse() - causes this character sequence to be replaced by the reverse of the sequence.
        System.out.println("2. .reverse() - causes this character sequence to be replaced\n" +
                "by the reverse of the sequence. ->");
        System.out.println("sb1 -> " + sb1);
        System.out.println(sb1.reverse() + " <- reversed sb1");
        System.out.println();

        // 3. .insert(index, object) - inserts object at index position
        System.out.println("3. .insert(index, object) - inserts object at index position ->");
        StringBuilder sb3 = new StringBuilder();
        sb3.insert(0, "hello");
        System.out.println("sb3 -> " + sb3);
        sb3.insert(3, ">JAVA<");
        System.out.println("sb3 inserted ->" + sb3);
        System.out.println();

        // 4. .replace(startIndex, endIndex, "String") - replace piece of string with a given String
        System.out.println("4. .replace(startIndex, endIndex, \"String\")\n" +
                "- replace piece of string with a given String ->");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("some text here");
        System.out.println("sb4 -> " + sb4);
        sb4.replace(5, 7, "OOPS");
        System.out.println("replaced part here -> " + sb4);
        System.out.println();

        // 5. .deleteCharAt(index) - deleting character at given index
        System.out.println("5. .deleteCharAt(index) - deleting character at given index ->");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("more teXt eXample");
        System.out.println("sb5 -> " + sb5);
        sb5.deleteCharAt(7);
        sb5.deleteCharAt(10);
        System.out.println("sb5 after deleted chars -> " + sb5);
        System.out.println();

        // 6. .delete(startIndex, endIndex) - delete part of string between indexes
        System.out.println("6. .delete(startIndex, endIndex) - delete part of string between indexes ->");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("$---< WRITE SOME TEXT >---$");
        System.out.println("sb6 -> " + sb6);
        sb6.delete(0, 1);
        sb6.delete(5, 21);
        sb6.delete(9, 10);
        System.out.println("sb6 after deleting some parts -> " + sb6);
    }
}
