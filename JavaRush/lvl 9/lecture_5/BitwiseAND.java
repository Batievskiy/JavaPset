// what is Bitwise AND & operator?
// let's find out
public class BitwiseAND {
    public static void main(String[] args) {
        System.out.println("---< Bitwise AND & operator >---");
        int n1 = 11;
        int n2 = 9;
        System.out.println("binary:\n  " + Integer.toBinaryString(n1)
                + "\n& " + Integer.toBinaryString(n2));

        // This operator returns bit by bit AND of input values
        // if both bits are 1 -> it gives 1, else -> it gives 0
        int r1 = n1 & n2;
        // n1 = 1011
        // n2 = 1001
        // r1 = 1001 (9 in decimal)
        System.out.println("  ____\n  " + Integer.toBinaryString(r1));
        System.out.println("decimal:\n" + n1 + " & " + n2 + " = " + r1);
        System.out.println();
    }
}


/*

 */