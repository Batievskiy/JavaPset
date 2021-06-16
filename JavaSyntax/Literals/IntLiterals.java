// what is the Integral Literals in Java?
// let's find out
public class IntLiterals {
    public static void main(String[] args) {
        System.out.println("---< Integral Literals in Java >---");
        // Literal - > any value
        // which can be assigned to the variable
        // is called as literal/constant

        // For Integral data types (byte, short, int, long)
        // we can specify literals in four ways:

        // Decimal literals (base 10)(0-9)
        int a = 101;

        // Octal literals (base 8)(0-7)
        int b = 0100;

        // Hexa-decimal literals (base 16)(0-9, A-F)
        int c = 0xCAFEBABE;

        // Binary literals (base 2)(0-1)
        int d = 0b1111;

        System.out.println("Decimal literals (base 10)(0-9)"
                + "\nint a = 101;"
                + "\n---< " + a);
        System.out.println("Octal literals (base 8)(0-7)"
                + "\nint b = 0100;"
                + "\n---< " + b);
        System.out.println("Hexa-decimal literals (base 16)(0-9, A-F)"
                + "\nint c = 0xCAFEBABE;"
                + "\n---< " + c);
        System.out.println("Binary literals (base 2)(0-1)"
                + "\nint c = 0b1111;"
                + "\n---< " + d);
    }
}
