import java.util.Arrays;

// JavaRush lvl 11 lecture 5
// Compare objects
public class CompareObjectsJavaRush {
    public static void main(String[] args) {

        // Compare by addresses
        Integer a = 7;
        Integer b = a;
        System.out.printf("a = %d;\n" +
                "b = a;\n", a);
        boolean isABAddresses = (a == b); // compare addresses
        System.out.println("a's address = " + System.identityHashCode(a));
        System.out.println("b's address = " + System.identityHashCode(b));
        System.out.println("a == b (equal addresses) ? -> " + isABAddresses);
        System.out.println();

        // Compare by values
        String s1 = new String("Hello Java World");
        String s2 = new String("Hello Java World");
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);
        System.out.println("s1's address = " + System.identityHashCode(s1));
        System.out.println("s2's address = " + System.identityHashCode(s2));
        boolean isS1S2Addresses = (s1 == s2); // compare addresses
        boolean isS1S2Values = s1.equals(s2); // compare values
        System.out.println("s1 == s2 (equal addresses) ? -> " + isS1S2Addresses);
        System.out.println("s1 equals s2 by value ? -> " + isS1S2Values);
        System.out.println();
    }
}
