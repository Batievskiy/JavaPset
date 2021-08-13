import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

// Class Files
public class FilesCreateLvl16L6 {
    public static void main(String[] args) {
        try {
            // creating a new file
            Files.createFile(Path.of("test.txt"));

            // creating a new directory
            Files.createDirectory(Path.of("c:\\test"));

            // creating a new directory and all subdirectories
            Files.createDirectories(Path.of("c:\\test2\\folder1\\folder2\\folder3"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
