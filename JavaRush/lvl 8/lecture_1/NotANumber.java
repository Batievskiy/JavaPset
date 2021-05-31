// primitive problem from JavaRush
// print out NaN using some methods
public class NotANumber {
    public static void main(String[] args) {
        div(0.0, 0.0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
