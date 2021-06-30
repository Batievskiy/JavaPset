// what is .repeat(count) method in Java?
// let's find out
public class RepeatStringMethod {
    public static void main(String[] args) {
        System.out.println("---< .repeat(count) method in Java >---\n");
        // The string can be repeated N number of times

        // repeat() - return String whose value is the concatenation
        // of given String repeated count times.

        String s1 = new String("Hello Java World");
        int count = 3;
        System.out.println("repeat s1 3 times -> " + s1.repeat(count));
    }
}
