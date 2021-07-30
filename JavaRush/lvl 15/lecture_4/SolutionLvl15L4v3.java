import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

// JavaRush lvl 15 lecture 4 problem
// catch exception in copyFile method
// wraps it in RuntimeException -> and throws it further
public class SolutionLvl15L4v3 {
    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}

class FileUtils {
    public static void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading file -> " + filePath);
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Writing data into file -> " + filePath);
    }
}
