// what is Bitwise Left Shift << operator?
// let's find out
public class BitwiseLeftShift {
    public static void main(String[] args) {
        System.out.println("---< Bitwise Left Shift << operator >---");
        int n1 = 11;
        int n2 = -10;

        // Signed Right shift operator (<<)
        int r1 = n1 << 1;
        int r2 = n2 << 1;
        // n1 = 11
        // r1 << 1 = 22
        // n2 = -10
        // r2 << 1 = -20
        // preserve the sigh bit

        // 0000 1011 << 1 = 1111 1010
        System.out.println("Bitwise Left Shift <<\n" + Integer.toBinaryString(n1) + " << 1");
        String result = Integer.toBinaryString(r1);
        String res1Zeros = String.format("%4s", result).replace(" ", "0");
        System.out.println("____\n" + res1Zeros);
        System.out.println("decimal:\n" + n1 + " << 1 = " + r1);
        System.out.println();

        System.out.println("Bitwise Left Shift <<\n" + Integer.toBinaryString(n2) + " << 1");
        String result2 = Integer.toBinaryString(r2);
        String res2Zeros = String.format("%32s", result2).replace(" ", "0");
        System.out.println("____\n" + res2Zeros);
        System.out.println("decimal:\n" + n2 + " << 1 = " + r2);
        System.out.println();
    }
}