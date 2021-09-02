public class SumOfDigitsRecursive {
    public static void main(String[] args) {
        int number = 37;
        System.out.println("sum of digits in " +
                number + " is -> " + sumDigits(number));
    }

    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10 + sumDigits(number / 10));
    }
}
