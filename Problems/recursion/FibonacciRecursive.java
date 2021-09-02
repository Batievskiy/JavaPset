public class FibonacciRecursive {
    public static void main(String[] args) {

        int number = 7;
        System.out.println("fibonacci of " +
                number + " is -> " + fib(number));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
