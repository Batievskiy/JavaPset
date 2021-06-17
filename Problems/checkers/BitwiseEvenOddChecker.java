import java.util.Scanner;

// let's create Even Odd checker using Bitwise AND & operator
public class BitwiseEvenOddChecker {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Even ? Odd checker using Bitwise AND & operator >---");
        int N = getInt();
        nEvenOdd(N);
        printBitwise(N);
    }

    // let's use Bitwise AND to tell is a Number Even or Odd
    // The integer is odd of and only if the least significant Bit b0 is 1
    // By AND &-ing number with 1 we eliminate all the other bits than b0
    // for example number 77:
    //   01001101
    // & 00000001
    //   ________
    //   00000001 <--- least bit is 1 ---> number is Odd
    private static void nEvenOdd(int number) {
        if ((number & 1) == 0) {
            System.out.println("---< number " + number + " is Even");
        } else {
            System.out.println("---< number " + number + " is Odd");
        }
    }

    private static int getInt() {
        String number;
        do {
            System.out.print("enter a number: ");
            number = sc.nextLine();
            if (!number.matches("^-?\\d+$")) {
                System.out.println("not a number!");
                number = "";
            }
        } while (number.isEmpty());
        return Integer.parseInt(number);
    }

    private static void printBitwise(int number) {
        String zerosBiN = getBin(number);
        String zerosOne = getBin(1);
        System.out.println("   " + zerosBiN + "\n&  " + zerosOne);
        System.out.print("   ");
        for (int i = 0; i < 32; i++) {
            System.out.print("_");
        }
        System.out.println();
        int check = number & 1;
        String result = getBin(check);
        if (check == 1) {
            System.out.println("   " + result + " <--- this Bit is 1 for Odd numbers");
        } else {
            System.out.println("   " + result + " <--- this Bit is 0 for Even numbers");
        }
    }

    private static String getBin(int number) {
        String bin = Integer.toBinaryString(number);
        bin = String.format("%32s", bin).replace(" ", "0");
        return bin;
    }
}
