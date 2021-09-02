public class FactorialRecursive {

    public static void main(String[] args) {
        int number = 0;
        System.out.println("factorial of " +
                number + " is -> " + fact(number));

    }

    public static int fact(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
