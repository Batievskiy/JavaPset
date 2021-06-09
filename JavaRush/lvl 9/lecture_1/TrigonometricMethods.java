// what is Trigonometric Methods in Java?
// let's find out

import java.util.Scanner;

public class TrigonometricMethods {

    // The java.lang.Math class contains methods for trigonometric operations like:
    // cos(), sin(), tan(), tanh(), cosh(), atan(), etc.

    // scanner object to get users input
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Trigonometric Methods in Java >---");

        // ast user for angle value in degrees
        double degree = getAngle();
        sc.close();

        System.out.println("\n---< let's calculate sin, cos and tan of angle: ");
        // let's use Math. methods in Java
        System.out.println("sine of " + degree + " is: " + Math.sin(Math.toRadians(degree)));
        System.out.println("cosine of " + degree + " is: " + Math.cos(Math.toRadians(degree)));
        System.out.println("tan of " + degree + " is: " + Math.tan(Math.toRadians(degree)));

        System.out.println("\n---< let's calculate sinh, cosh and tanh of angle: ");
        System.out.println("hyperbolic sine of " + degree + " is: " + Math.sinh(Math.toRadians(degree)));
        System.out.println("hyperbolic cosin of " + degree + " is: " + Math.cosh(Math.toRadians(degree)));
        System.out.println("hyperbolic tan of " + degree + " is: " + Math.tanh(Math.toRadians(degree)));

        System.out.println("\n---< let's calculate asin, acos and atan of angle: ");
        System.out.println("arc sine of " + degree + " is: " + Math.asin(Math.toRadians(degree)));
        System.out.println("arc cosine of " + degree + " is: " + Math.acos(Math.toRadians(degree)));
        System.out.println("arc tan of " + degree + " is: " + Math.atan(Math.toRadians(degree)));

        System.out.println("\n---< let's calculate asin, acos and atan of angle: ");
        double secOfAngle = 1 / Math.sin(Math.toRadians(degree));
        double cosecOfAngle = 1 / Math.cos(Math.toRadians(degree));
        double cotOfAngle = 1 / Math.tan(Math.toRadians(degree));
        System.out.println("Sec of " + degree + " is: " + secOfAngle);
        System.out.println("Cosec of " + degree + " is: " + cosecOfAngle);
        System.out.println("Cotangent of " + degree + " is: " + cotOfAngle);
    }

    private static double getAngle() {
        String angle;
        do {
            System.out.print("enter angle value in degree: ");
            angle = sc.nextLine().trim();
            // not bad Regular Expression for double - "^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$"
            if (!angle.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$")) {
                System.out.println("this is not degree! Try again!");
                angle = "";
            }
        } while (angle.isEmpty());
        return Double.parseDouble(angle);
    }
}
