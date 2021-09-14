import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("C:/text.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String text = "I love JAVA";

        byte[] buffer = text.getBytes();

        bufferedOutputStream.write(buffer, 0, buffer.length);
        bufferedOutputStream.close();
    }
}
