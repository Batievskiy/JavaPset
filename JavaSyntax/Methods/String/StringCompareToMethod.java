// what is .compareTo() method in Java?
// let's find out
public class StringCompareToMethod {
    public static void main(String[] args) {
        System.out.println("---< .compareTo() method in Java >---\n");
        // .compareTo() method has three variants:

        // 1. .compareTo(Object object) - compare String to another Object lexicographically
        // Return Value :
        // The value 0 if the argument is a string lexicographically equal to this string;
        // a value less than 0 if the argument is a string lexicographically greater than this string;
        // a value greater than 0 if the argument is a string lexicographically less than this string.
        System.out.println("1. .compareTo(Object object) - compare String to another Object lexicographically ->");
        String s1 = "HELLO";
        String s2 = "oops";
        String o1 = new String("hello"); // in Java Heap
        String o2 = new String("world");
        System.out.println("String 1 in Pool -> " + s1);
        System.out.println("String 2 is Pool -> " + s2);
        System.out.println("Object 1 in Heap -> " + o1);
        System.out.println("Object 2 in Heap -> " + o2);

        System.out.println("compare String 1 and Object 1-> "
                + s1.compareTo(o1));
        System.out.println("compare String 1 and Object 2-> "
                + s1.compareTo(o2));
        System.out.println();

        // 2. .compareTo(String anotherString) - compares two Strings lexicographically ->
        // Return Value :
        // The value 0 if the argument is a string lexicographically equal to this string;
        // a value less than 0 if the argument is a string lexicographically greater than this string;
        // a value greater than 0 if the argument is a string lexicographically less than this string.
        System.out.println("2. .compareTo(String anotherString) - compares two Strings lexicographically ->");
        System.out.println("String 1 in Pool -> " + s1);
        System.out.println("String 2 is Pool -> " + s2);
        System.out.println("Object 1 in Heap -> " + o1);
        System.out.println("Object 2 in Heap -> " + o2);

        System.out.println("compare String 1 and String 2-> "
                + s1.compareTo(s2));
        System.out.println();

        // 3. .compareToIgnoreCase(String string) - compares two strings lexicographically, ignoring case difference
        // Return Value:
        // This method returns a negative integer, zero, or a positive integer as
        // the specified String is greater than, equal to, or less than this String,
        // ignoring case considerations.
        System.out.println("3. .compareToIgnoreCase(String string) - compares two strings lexicographically," +
                " ignoring case difference ->");
        System.out.println("String 1 in Pool -> " + s1);
        System.out.println("String 2 is Pool -> " + s2);
        System.out.println("Object 1 in Heap -> " + o1);
        System.out.println("Object 2 in Heap -> " + o2);
        System.out.println("compare String 1 and String 2-> "
                + s1.compareTo(s2));
        System.out.println();

    }
}
