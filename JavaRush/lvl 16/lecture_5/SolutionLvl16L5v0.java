import java.nio.file.Path;
import java.util.Scanner;

// JavaRush lvl 16 lecture 5 problem
// Create a program where user enters file path
// and root prints out in console using getRoot()
public class SolutionLvl16L5v0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();
        Path root = Path.of(string).getRoot();
        System.out.println(root);
    }
}
