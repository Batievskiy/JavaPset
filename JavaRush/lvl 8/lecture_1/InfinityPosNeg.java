// primitive problem from JavaRush
// create simple method to print out positive infinity and negative infinity
public class InfinityPosNeg {

    public static void main(String[] args) {
        div( 0.0, 10);
        div( 0.0, -10);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
