import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class OutputStreamLvl16L4v0 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("output.txt");
        byte[] byteArray = {65, 66, 67, 68, 69, 70};

        // write(byte[] b) - Writes b.length bytes
        // from the specified byte array to this output stream
        outputStream.write(byteArray);

        // flush() - Flushes this output stream
        // and forces any buffered output bytes to be written out
        outputStream.flush();

        for (int i = 71; i < 75; i++) {
            outputStream.write(i);
            System.out.print((char) i);
        }

        outputStream.flush();

        // close() - Closes this output stream
        // and releases any system resources associated with this stream.
        outputStream.close();
    }
}
