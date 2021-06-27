// what is .trim() method in Java?
// let's find out
public class TrimMethod {
    public static void main(String[] args) {
        System.out.println("---< .trim() method in Java >---");
        // .trim() - eliminates leading and trailing spaces.

        // The Unicode value of space character is ‘\u0020’.
        // .trim() - checks this value before and after the string,
        // if it exists then removes the spaces and returns the omitted string.
        System.out.println(".trim() - eliminates leading and trailing spaces ->");
        String s1 = new String("   hello world of Java   ");
        System.out.println("s1 spaces ->" + s1 + "<-");
        System.out.println("s1 without spaces before and after ->" + s1.trim() + "<-");
    }
}
