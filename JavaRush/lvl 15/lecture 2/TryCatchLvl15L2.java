// Try {} Catch (Exception) {} - methods
public class TryCatchLvl15L2 {
    public static void main(String[] args) {
        System.out.println("Large Hadron Collider launched");

        try {
            runHadronCollider(1);
            runHadronCollider(0);
        } catch (Exception e) {
            System.out.println("Error! Exception has been caught :)");
            System.out.println("Planet sucked into a Black Hole");
        }

        System.out.println("Large Hadron Collider stopped!");
    }

    public static void runHadronCollider(int n) {
        System.out.println("everything is fine :)");
        System.out.print("divide 2 by " + n + " = ");
        System.out.println(2 / n);

        System.out.println("No problems :)");
    }
}
