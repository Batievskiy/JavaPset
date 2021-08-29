import java.nio.file.Path;
import java.nio.file.Paths;

public class IsAbsoluteJRLvl16L8 {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\test\\text.txt");
        Path path2 = Paths.get("file.txt");

        // check is the Path is absolute
        System.out.println(path.isAbsolute());
        System.out.println(path2.isAbsolute());
    }
}
