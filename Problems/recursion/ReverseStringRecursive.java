public class ReverseStringRecursive {
    public static void main(String[] args) {
        String s = "Hello, Java World";
        System.out.println("the given string -> " + s);
        reverseString(s);
    }

    public static void reverseString(String s) {
        // base condition
        if ((s == null) || (s.length() <= 1)) {
            System.out.println(s);
        } else {
            // recursively print each character of the string from the end
            System.out.print(s.charAt(s.length() - 1));
            reverseString(s.substring(0, s.length() - 1));
        }
    }
}
