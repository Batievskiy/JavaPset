import java.nio.file.Path;
import java.nio.file.Paths;

public class PathJRLvl16L8 {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("c:\\test\\input.txt");

        // 1. .getFileName() - returns name of a file from Path
        Path fileName = testFilePath.getFileName();
        System.out.println(".getFileName() -> " + fileName);

        // 2. .getParent() - returns parent directory from Path
        Path parentDirectory = testFilePath.getParent();
        System.out.println(".getParent() -> " + parentDirectory);

        // 3. .getRoot() - returns root directory from Path
        Path rootDirectory = testFilePath.getRoot();
        System.out.println(".getRoot() -> " + rootDirectory);

        // 4. .endsWith() - check is Path ends with Path
        boolean endsWithTxt = testFilePath.endsWith("c:\\test\\input.txt");
        System.out.println(".endsWith() -> " + endsWithTxt);

        // 5. .startsWith() - check is Path starts with Path
        boolean startsWithLalala = testFilePath.startsWith("lalalala");
        System.out.println(".startsWith() -> " + startsWithLalala);
    }
}
