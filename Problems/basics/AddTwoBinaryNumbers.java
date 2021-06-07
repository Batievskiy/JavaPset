// ask user two binary numbers
// print out its Sum

import java.util.Scanner;

public class AddTwoBinaryNumbers {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---< Add Two Binary Numbers >---");
        long binary1, binary2;
        int i = 0, carry = 0;

        int[] sum = new int[10];

        binary1 = getBinaryNumber("first");
        binary2 = getBinaryNumber("second");
        sc.close();

        // dive into fundamentals
        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 +
                    binary2 % 10 + carry) % 2);
            carry = (int)((binary1 % 10 +
                    binary2 % 10 + carry) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("result: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println();
    }

    private static long getBinaryNumber(String which) {
        String binaryNumber = "";
        while (binaryNumber.isEmpty()) {
            System.out.print("enter " + which + " BINARY number: ");
            binaryNumber = sc.nextLine();

            // Regular Expression [01]+ - means:
            // it's a match if the string supplied
            // does contain one or more of just 0's and 1's
            if (!binaryNumber.matches("[01]+")) {
                System.out.println("this is not a BINARY number! Try again!");
                binaryNumber = "";
            }
        }
        return Long.parseLong(binaryNumber);
    }
}
