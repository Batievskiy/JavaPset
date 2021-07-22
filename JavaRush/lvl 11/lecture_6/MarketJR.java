// JavaRush lvl 11 lecture 6 problem
// correct program
public class MarketJR {
    /* correct the code down below:
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (MarketJR.hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
     */
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = true;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) { // <--- use a local variable
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }

}
