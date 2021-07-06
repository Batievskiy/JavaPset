public class IsPalindromString {
    public static void main(String[] args) {

        // check is string a palindrome
        String s1 = "heh";
        System.out.println("is string \"heh\" palindrome? -> " + isPalindrome(s1));
        String s2 = "hey";
        System.out.println("is string \"hey\" palindrome? -> " + isPal(s2));

    }

    // using StringBuilder, .reverse() and .equals()
    private static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        return sb1.toString().equals(s);
    }

    // not using any other Class
    private static boolean isPal(String s) {
        if (s == null) {
            return false;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
