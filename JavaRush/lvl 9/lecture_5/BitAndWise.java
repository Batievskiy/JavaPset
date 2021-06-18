// strange problem from JavaRush
// comment out two lines for print out "5"
public class BitAndWise {
    public static void main(String[] args) {
        int x = 7;
        // x = x & 25;
        x = x & 5;
        // x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}
