// what is Bitwise NOT Complement ~ operator?
// let's find out
public class BitwiseNOT {
    public static void main(String[] args) {
        System.out.println("---< Bitwise NOT Complement ~ operator >---");
        int n1 = (Integer.MAX_VALUE - 1);
        String n = Integer.toBinaryString(n1);
        String withLeadingZeros = String.format("%32s", n).replace(" ", "0");

        System.out.println("binary:\n  " + withLeadingZeros);

        // This operator is a unary
        // returns the one's complement representation
        // of the input value, i.e, with all bits inverted
        // it takes every 0 of 1, and every 1 to 0.
        int r1 = ~n1;
        // n1 = 1011
        // r1 = 0010 (2 in decimal)
        System.out.println("  ____\n  " + Integer.toBinaryString(r1));
        System.out.println("decimal:\n~" + n1 + " = " + r1);
        System.out.println();
    }
}