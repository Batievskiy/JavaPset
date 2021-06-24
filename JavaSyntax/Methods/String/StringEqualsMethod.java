// what is boolean .equals() method in Java?
// let's find out
public class StringEqualsMethod {
    public static void main(String[] args) {
        System.out.println("---< boolean .equals() method in Java >---\n");
        // .equals method compares the two given strings
        // based on the data/content of the string.
        // If all the contents of both the strings are same then it returns True.

        String s1 = "hello"; // in Java String Pool
        System.out.println("s1 in Pool -> " + s1);
        String s2 = new String("hello"); // in Java Heap
        System.out.println("s2 in Heap -> " + s2);

        System.out.println("is equals values? -> " + s1.equals(s2));
        System.out.println("is equal addresses? -> " + (s1 == s2));
    }
}