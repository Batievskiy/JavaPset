public class PalindromeRecursive {
    public static void main(String[] args) {
        int number = 121;
        try {
            isPalindrome(number);
            System.out.println("yes, the given number " + number + " is a Palindrome");
        } catch (Exception e) {
            System.out.println("No, the given number " + number + " is not a Palindrome");
        }
    }

    // function to check if number contains only one digit
    public static int oneDigit(int n) {
        if ((n >= 0) && (n < 10)) {
            return 1;
        } else {
            return 0;
        }
    }

    // palindrome utility function
    public static int isPalindromeUtil(int number, int reversedN) throws Exception {
        // checking base condition
        if (number == 0) {
            return reversedN;
        }
        // recursive call
        else {
            System.out.println("recursive call");
            System.out.println(number + " : " + reversedN);
            reversedN = isPalindromeUtil(number / 10, reversedN);
        }
        // check if first digit of number and reversedN are equal
        System.out.println(number + " : " + reversedN);
        if (number % 10 == reversedN % 10) {
            // if yes, reversedN will move with number
            System.out.println("number % 10 == reversedN % 10 -> " + number + " : " + reversedN);
            return reversedN / 10;
        } else {
            // exit
            throw new Exception();
        }
    }

    // check f a given number is palindrome using isPalindromeUtil()
    public static int isPalindrome(int number) throws Exception {
        if (number < 0) {
            number = (-number);
        }
        int reversedN = number;
        return isPalindromeUtil(number, reversedN);
    }
}
