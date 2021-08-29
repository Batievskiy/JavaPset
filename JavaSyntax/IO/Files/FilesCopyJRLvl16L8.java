import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class FilesCopyJRLvl16L8 {
    public static void main(String[] args) throws IOException {

        // file creating
        String fileName = "c:\\test\\text.txt";
        Path testFile1 = Files.createFile(Paths.get(fileName));
        System.out.println("is file exist?");
        System.out.println(Files.exists(Paths.get(fileName)));

        // directory creating
        String dirName = "c:\\test\\folder\\testDir";
        Path testDir1 = Files.createDirectory(Paths.get(dirName));
        System.out.println("is directory exist?");
        System.out.println(Files.exists(Paths.get(dirName)));

        // copying a file to newDirectory
        String newDir = "c:\\newDir";
        testFile1 = Files.copy(testFile1, Paths.get(newDir));
        System.out.println("is file copied?");
        System.out.println(Files.exists(Paths.get(newDir)));
    }
}
