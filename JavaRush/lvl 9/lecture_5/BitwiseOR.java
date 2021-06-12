// what is Bitwise OR | operator?
// let's find out
public class BitwiseOR {
    public static void main(String[] args) {
        System.out.println("---< Bitwise OR | operator >---");
        int n1 = 11;
        int n2 = 9;
        System.out.println("binary:\n  " + Integer.toBinaryString(n1)
                + "\n& " + Integer.toBinaryString(n2));

        // This operator returns bit by bit OR of input values
        // if either of bits are 1 -> it gives 1, else -> it gives 0
        int r1 = n1 | n2;
        // n1 = 1011
        // n2 = 1001
        // r1 = 1011 (11 in decimal)
        System.out.println("  ____\n  " + Integer.toBinaryString(r1));
        System.out.println("decimal:\n" + n1 + " | " + n2 + " = " + r1);
        System.out.println();
    }
}