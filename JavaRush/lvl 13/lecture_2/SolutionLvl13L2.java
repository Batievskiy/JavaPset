// JavaRush lvl 13 lecture 2 problem
// create processPayment(String) method
// - that accept bill and withdraw money from current account
public class SolutionLvl13L2 {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("current balance: " + balance);
        processPayment(bill);
        System.out.println("current balance: " + balance);
    }

    public static void processPayment(String bill) {
        balance = balance - Integer.parseInt(bill);
    }
}
