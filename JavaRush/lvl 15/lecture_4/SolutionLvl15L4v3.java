// catch the RuntimeException in main method.
// figure out what type of the exception is.
// - if that is FileNotFoundException - print out "File not found".
// - if that is FileSystemException - print "Can't write the file"

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class SolutionLvl15L4v3 {

    public static final String FAILED_TO_READ = "Can't read the file";
    public static final String FAILED_TO_WRITE = "Can't write to the file";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            }
            if (cause instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}

class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading the file : " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Writing the file : " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileSystemException e) {
            throw new RuntimeException(e);
        }
    }
}