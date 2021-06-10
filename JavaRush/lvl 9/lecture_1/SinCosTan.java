import static java.lang.Math.toRadians;
// primitive problem from JavaRush
// use .sin .cos and .tan methods from Java
public class SinCosTan {

    public static void main(String[] args) {
        double a = 45.0;
        System.out.println(sin(a));
        System.out.println(cos(a));
        System.out.println(tan(a));
    }

    public static double sin(double a) {
        return Math.sin(toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(toRadians(a));
    }
}