import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class JavaInputStreamBasics {

    /*
    The InputStream class of the java.io package
    - is an abstract superclass that represents an input stream of bytes.

    Since InputStream is an abstract class,
    - it is not useful by itself.
    However, its subclasses can be used to read data.
     */

    public static void main(String[] args) {
        String path = "input.txt";

        byte[] array = new byte[100];

        // create an InputStream
        try {
            InputStream input = new FileInputStream(path);

            // .available() - returns the number of bytes available in the input stream
            System.out.println("available bytes in the file -> " + input.available());

            // .read() - reads one byte of data from the input stream
            input.read(array);
            System.out.println("data read from the file -> " + Arrays.toString(array));

            // convert byte array into String
            String data = new String(array);
            System.out.println("arrayString -> " + data);

            // close the input stream
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        methods:

        read() - reads one byte of data from the input stream

        read(byte[] array) - reads bytes from the stream and stores in the specified array

        available() - returns the number of bytes available in the input stream

        mark() - marks the position in the input stream up to which data has been read

        reset() - returns the control to the point in the stream where the mark was set

        markSupported() - checks if the mark() and reset() method is supported in the stream
        
        skips() - skips and discards the specified number of bytes from the input stream

        close() - closes the input stream
         */

    }
}
