import java.util.Scanner;

public class AddAllDigits {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getDecimal();
        int sum;
        sum = addAllDigits(number);
        System.out.println(sum);
    }

    private static int addAllDigits(int number) {
        int sum = 0;
        int temp = number;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            sum += temp % 10;
            temp = temp / 10;
        }
        return sum;
    }

    private static int getDecimal () {
        String decimal;
        do {
            System.out.print("enter decimal number: ");
            decimal = sc.nextLine().trim();
            if (!decimal.matches("(-?)\\d+")) {
                System.out.println("not a decimal!");
                decimal = "";
            }
        } while (decimal.isEmpty());
        return Integer.parseInt(decimal);
    }
}
