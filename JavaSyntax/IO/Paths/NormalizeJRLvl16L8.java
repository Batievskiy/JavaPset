import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeJRLvl16L8 {
    public static void main(String[] args) {
        Path path1 = Paths.get("c:\\test\\..\\text.txt");
        Path path2 = Paths.get("\\.\\text.txt");

        // deletes the unnecessary elements from the Path
        System.out.println(path1.normalize());
        System.out.println(path2.normalize());
    }
}
