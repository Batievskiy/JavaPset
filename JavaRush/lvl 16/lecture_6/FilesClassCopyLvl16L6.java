import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

// Class Files
public class FilesClassCopyLvl16L6 {
    public static void main(String[] args) {

        Path path2 = Path.of("test-copy.txt");
        try {
            // creating a file
            Path file = Files.createFile(Path.of("test.txt"));

            // copying a file
            Files.copy(file, path2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
