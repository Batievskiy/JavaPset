import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesClassDeleteLvl16L6 {
    public static void main(String[] args) {
        try {
            // creating a new file
            Path file = Files.createFile(Path.of("test.txt"));

            // deleting it
            Files.delete(Path.of("test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
