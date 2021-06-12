// what is Bitwise XOR ^ operator?
// let's find out
public class BitwiseXOR {
    public static void main(String[] args) {
        System.out.println("---< Bitwise XOR ^ operator >---");
        int n1 = 11;
        int n2 = 15;
        System.out.println("binary:\n  " + Integer.toBinaryString(n1)
                + "\n& " + Integer.toBinaryString(n2));

        // This operator returns bit by bit OR of input values
        // if corresponding bits are different -> it gives 1, else -> it gives 0
        int r1 = n1 ^ n2;
        // n1 = 1011
        // n2 = 1001
        // r1 = 0010 (2 in decimal)
        String result = Integer.toBinaryString(r1);
        String withLeadingZeros = String.format("%4s", result).replace(" ", "0");
        System.out.println("  ____\n  " + withLeadingZeros);
        System.out.println("decimal:\n" + n1 + " ^ " + n2 + " = " + r1);
        System.out.println();
    }
}