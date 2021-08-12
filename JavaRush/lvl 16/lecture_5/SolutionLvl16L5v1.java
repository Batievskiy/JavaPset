import java.nio.file.Path;
import java.util.Scanner;

// JavaRush lvl 16 lecture 5 problem
// create program to read two file paths from console
// and create one relative path
public class SolutionLvl16L5v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine().trim();
        String string2 = sc.nextLine().trim();

        Path path1 = Path.of(string1);
        Path path2 = Path.of(string2);
        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception e) {
            try {
                System.out.println(path2.relativize(path1));
            } catch (Exception ignore) {

            }
        }
    }
}
