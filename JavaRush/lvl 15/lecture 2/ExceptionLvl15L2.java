// simple exception example
public class ExceptionLvl15L2 {
    public static void main(String[] args) {
        System.out.println("Attention! Prepare to End of the World :)");
        endOfTheWorld();
        System.out.println("End of the World is ended :)");

    }

    public static void endOfTheWorld() {
        System.out.println("doing something important...");
        divide(0);
        System.out.println("everything works fine :)");
    }

    public static void divide(int n) {
        System.out.println("nothing bad happens -> " + n);
        System.out.println(2 / n); // <---ArithmeticException: / by zero
        System.out.println("nothing bad happened -> " + n);
    }
}
