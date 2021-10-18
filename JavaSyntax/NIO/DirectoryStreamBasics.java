import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamBasics {

    private static final String THIS_IS_DIR = " - is a directory.";
    private static final String THIS_IS_FILE = " - is a file.";

    public static void main(String[] args) throws IOException {
        Path dirPath = Path.of("C:/Users/");

        try (DirectoryStream<Path> pathDirectoryStream = Files.newDirectoryStream(dirPath)) {
            for (Path currentPath : pathDirectoryStream) {
                if (Files.isDirectory(currentPath)) {
                    System.out.println(currentPath + THIS_IS_DIR);
                } else if (Files.isRegularFile(currentPath)) {
                    System.out.println(currentPath + THIS_IS_FILE);
                }
            }
        }
    }
}
