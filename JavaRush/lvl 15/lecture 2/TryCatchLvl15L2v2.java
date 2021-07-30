// Try {} Catch (Exception) {} - methods
public class TryCatchLvl15L2v2 {
    public static void main(String[] args) {
        System.out.println("start of the main method!");

        try {
            calculate(0);
        } catch (ArithmeticException e) {
            System.out.println("Error!\nDivision to 0 is not permitted!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException has been caught!");
        } catch (Exception e) {
            System.out.println("SOME exception has been caught!");
        } catch (Throwable e) { // <--- can catch cny of Exceptions
            System.out.println("Throwable has been caught!");
        }

        System.out.println("end of the main method");
    }

    public static void calculate(int n) {
        System.out.println("calculate starts!");
        System.out.print("divide 2 by " + n + " = ");
        System.out.println(2 / n);
        System.out.println("calculate ended!");
    }
}
