import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Arrays;

public class ReaderClassBasics {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("input.txt");

            char[] chars = new char[10];
            CharBuffer charBuffer = CharBuffer.wrap(chars);

            if (reader.markSupported()) {
                reader.mark(100);
                System.out.println(".mark() -> supported");
            }
            // skipping 5 chars
            reader.skip(5);

            //checking stream ready to read
            if (reader.ready()) {

                // .read(char[] cbuf, int off, int len)
                reader.read(chars, 0, 10);
                System.out.println(Arrays.toString(chars));

                // .read(charbuffer target)
                reader.read(charBuffer);
                System.out.println(Arrays.toString(charBuffer.array()));

                // .read()
                System.out.println((char) reader.read());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
