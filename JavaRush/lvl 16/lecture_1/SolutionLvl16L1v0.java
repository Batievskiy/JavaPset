// change try-with-resource to try catch
// don't forget about close() method
import java.util.Scanner;

public class SolutionLvl16L1v0 {
    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            String line = sc.nextLine().trim();
//            System.out.println(line.toUpperCase());
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }

        Scanner sc = new Scanner(System.in);
        try {
            String line = sc.nextLine().trim();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (sc != null)
            sc.close();
        }
    }
}
