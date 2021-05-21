/* what is constant variables?
 * variable whose value cannot change once it has been assigned
 * we write constants in capital letters to differentiate them from ordinary variables
 * if you try to change the constant in the program, compiler sends an error
 * constant variable can make primitive data type immutable of unchangeable
 * We use constants to make the program easy and understandable
*/
public class ConstantVariables {
    // this constant used only within this class
    private static final double BUCK_PER_HOUR = 77.00;
    private static final double MIN_BUCK_PER_HOUR = 11.00;

    // this is Pi number and it cannot be changed during program
    private static final double Pi = 3.1415926536;

    // here we gonna calculate total bucks based on days of work
    public static void main(String[] args) {
        int numberOfWorkingDays = 31;
        System.out.println("MIN BUCK you'll get: " + numberOfWorkingDays * MIN_BUCK_PER_HOUR);
        System.out.println("MAX BUCK you'll get: " + numberOfWorkingDays * BUCK_PER_HOUR);

        // let's count perimeter of circle with the formula: P = 2πR

        double radius = 10;
        System.out.println("perimeter of circle: " + getPerimeter(radius) + "sm");
    }

    public static double getPerimeter(double radius) {
        radius = 2 * Pi * radius;
        return radius;
    }
}
