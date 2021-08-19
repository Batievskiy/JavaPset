import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 10. Write a Java program
// to read contents from a file into byte array.
public class IOExercise10 {
    public static void main(String[] args) {
        String fileName = "input.txt";
        InputStream input = null;
        try {
            input = new FileInputStream(fileName);
            byte[] fileArray = new byte[2 * 1024];
            int readCounter = 0;
            while ((readCounter = input.read(fileArray)) > 0) {
                System.out.println(new String(fileArray, 0, readCounter - 1));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
