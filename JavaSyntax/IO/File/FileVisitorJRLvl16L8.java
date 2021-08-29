import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.util.List;

public class FileVisitorJRLvl16L8 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("c:\\"), new MyFileVisitor());
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        List<String> stringList = Files.readAllLines(file);
        for (String line : stringList) {
            if (line.contains("this is the file we need")) {
                System.out.println("here is needed file!");
                System.out.println(file.toAbsolutePath());
                break;
            }
        }

        // what to do after all procedures -> continue
        return FileVisitResult.CONTINUE;
        // return FileVisitResult.TERMINATE; // <--- if one file needed
    }

}
