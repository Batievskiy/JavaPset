// what is Bitwise Unsigned Right Shift >>> operator?
// let's find out
public class BitwiseUnsignedRightShift {
    public static void main(String[] args) {
        System.out.println("---< Bitwise Unsigned Right Shift >>> operator >---");
        int n1 = 11;
        int n2 = -10;

        // Unsigned Right shift operator (>>>)
        // shifts the bits of the number to the right
        // and fills 0 on voids left as a result.
        // The leftmost bit is set to 0
        int r1 = n1 >>> 2;
        int r2 = n2 >>> 2;
        // n1 = 11
        // r1 >>> 2 = 2
        // n2 = -10
        // r2 >>> 2 = 1
        // DOES NOT preserve the sigh bit

        // 0000 1011 >>> 2 = 0000 0010(1)(1)
        System.out.println("Unsigned Right Shift >>>\n" + Integer.toBinaryString(n1) + " >>> 1");
        String result = Integer.toBinaryString(r1);
        String res1Zeros = String.format("%4s", result).replace(" ", "0");
        System.out.println("____\n" + res1Zeros);
        System.out.println("decimal:\n" + n1 + " >>> 1 = " + r1);
        System.out.println();

        System.out.println("Unsigned Right Shift >>>\n" + Integer.toBinaryString(n2) + " >>> 1");
        String result2 = Integer.toBinaryString(r2);
        String res2Zeros = String.format("%32s", result2).replace(" ", "0");
        System.out.println("____\n" + res2Zeros);
        System.out.println("decimal:\n" + n2 + " >>> 1 = " + r2);
        System.out.println();
    }
}
