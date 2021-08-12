import java.nio.file.Path;
import java.util.Scanner;

// JavaRush lvl 16 lecture 5 problem
// create program to read path from console
// and print io out
// if its not absolute -> convert it to absolute
public class SolutionLvl16L5v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();
        Path path = Path.of(string);
        System.out.println(ifNotAbsolute(path));

    }

    public static Path ifNotAbsolute (Path path) {
        if (path.isAbsolute()) {
            return path;
        } else {
            return path.toAbsolutePath();
        }
    }
}
