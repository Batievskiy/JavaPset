import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class FilesJRLvl16L8 {
    public static void main(String[] args) throws IOException {

        // creating a file
        String fileNameString = "c:\\test\\text.txt";
        Path testFile1 = Files.createFile(Paths.get(fileNameString));
        System.out.println("is file created?");
        boolean isFileExists = Files.exists(Paths.get(fileNameString));
        System.out.println("Files.exist() - > " + isFileExists);

        // creating a directory
        String directoryNameString = "c:\\test\\folder\\testDirectory";
        Path testDirectory = Files.createDirectory(Paths.get(directoryNameString));
        System.out.println("is directory created?");
        boolean isDirExists = Files.exists(testDirectory);
        System.out.println("Files.exists() -> " + isDirExists);

        // moving a file from folder to folder
        String movedFile = "c:\\test2";
        testFile1 = Files.move(testFile1, Paths.get(movedFile));
        System.out.println("is file moved?");
        System.out.println(Files.exists(Paths.get(movedFile)));

        // file deleting
        Files.delete(testFile1);
        boolean isFileDeleted = Files.exists(Paths.get(fileNameString));
        System.out.println("is file deleted? -> " + isFileDeleted);
    }
}
