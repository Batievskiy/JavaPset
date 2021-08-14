import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesInputOutputStream {
    public static void main(String[] args) {
        String src = "c\\test.txt";
//        InputStream input = new FileInputStream(src); // <--- bad idea, because of all exceptions may be thrown
        try {
            InputStream input = Files.newInputStream(Path.of(src));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // same here
        String src2 = "c:\\projects\\test.txt";
//        OutputStream output = new FileOutputStream(src); // <-- all the exceptions here
        try {
            OutputStream output = Files.newOutputStream(Path.of(src2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
