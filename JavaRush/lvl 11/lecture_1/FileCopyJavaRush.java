// JavaRush lvl 11 lecture 1
// file copy
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyJavaRush {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c:\\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\result.txt");

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
