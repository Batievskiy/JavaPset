// what is the Modulus % operator
// let's find out
public class ModulusOperator {
    public static void main(String[] args) {
        System.out.println("---< Modulus % operator >---");

        // This is binary operator that is used to return the remainder
        // when the first operand(dividend) is divided by the second operand(divisor)

        int a = 5;
        int b = 2;
        int remainder = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // remainder
        remainder = a % b;
        System.out.println("a % b = " + remainder);
    }
}
