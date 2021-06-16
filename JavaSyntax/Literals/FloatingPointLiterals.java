// what is the Floating Point Literals in Java?
// let's find out
public class FloatingPointLiterals {
    public static void main(String[] args) {
        System.out.println("---< Floating Point Literals in Java >---");
        // Literal - > any value
        // which can be assigned to the variable
        // is called as literal/constant

        // For Floating-point data types, we can specify literals
        // in only decimal form and we can't specify in Octal and hexa-decimal forms.
        // we must use f sign at the end
        // Decimal literals (base 10)(0-9)
        float a = 101.323f;
        float b = 0123.4758f;


        System.out.println("Decimal literals (base 10)(0-9)"
                + "\nfloat a = 101.323f;"
                + "\n---< " + a);
        System.out.println("Decimal literals (base 10)(0-9)"
                + "\nfloat b = 0123.4758f;"
                + "\n---< " + b);
    }
}
