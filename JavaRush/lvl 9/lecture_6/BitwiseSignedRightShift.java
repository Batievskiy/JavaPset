// what is Bitwise Signed Right Shift >> operator?
// let's find out
public class BitwiseSignedRightShift {
    public static void main(String[] args) {
        System.out.println("---< Bitwise Signed Right Shift >> operator >---");
        int n1 = 11;
        int n2 = -10;

        // Signed Right shift operator (>>)
        // shifts the bits of the number to the right
        // and fills the voids left with the sign bit
        // (1 in case of negative number and 0 in case of positive number).
        // The leftmost bit and r1 a depends on the sign of initial number
        // Similar effect as of dividing the number with some power of two.
        int r1 = n1>>1;
        int r2 = n2>>1;
        // n1 = 11
        // r1 >> 1 = 5
        // n2 = -10
        // r2 >> 1 = -5
        // preserve the sigh bit

        // 0000 1011 >> 1 = 0000 0101(1)
        System.out.println("Signed Right Shift >>\n" + Integer.toBinaryString(n1) + " >> 1");
        String result = Integer.toBinaryString(r1);
        String res1Zeros = String.format("%4s", result).replace(" ", "0");
        System.out.println("____\n" + res1Zeros);
        System.out.println("decimal:\n" + n1 + " >> 1 = " + r1);
        System.out.println();

        System.out.println("Signed Right Shift >>\n" + Integer.toBinaryString(n2) + " >> 1");
        String result2 = Integer.toBinaryString(r2);
        String res2Zeros = String.format("%32s", result2).replace(" ", "0");
        System.out.println("____\n" + res2Zeros);
        System.out.println("decimal:\n" + n2 + " >> 1 = " + r2);
        System.out.println();
    }
}