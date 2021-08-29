import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeJRLvl16L8 {
    public static void main(String[] args) {
        Path path1 = Paths.get("c:\\folder\\test\\text.txt");
        Path path2 = Paths.get("c:\\folder\\input.txt");

        // creates a relative path from two Paths
        System.out.println(path1.relativize(path2));
    }
}
