import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class BufferInputExample {

    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("D:/test.txt");
             BufferedInputStream buffer = new BufferedInputStream(inputStream)) {

            while (buffer.available() > 0) {
                char c = (char) buffer.read();

                System.out.println("char has been red!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
