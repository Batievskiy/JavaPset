import java.nio.file.Path;
import java.nio.file.Paths;

public class EndsWithJRLvl16L8 {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("c:\\test\\text.txt");

        // does not works with symbols
        System.out.println(testFilePath.endsWith("ext.txt"));

        // works only with Paths
        System.out.println(testFilePath.endsWith("test\\text.txt"));
    }
}
