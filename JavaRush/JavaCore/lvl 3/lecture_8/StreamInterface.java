import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamInterface {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("input.txt");
        OutputStream outputStream = new FileOutputStream("output.txt");

        // reading all bytes one by one
        while (inputStream.available() > 0) {
            int oneByte = inputStream.read(); // reads one byte from inputStream
            outputStream.write(oneByte); // writes one byte into outputStream
        }

        // and close all streams
        inputStream.close();
        outputStream.close();

        // same idea with own class
        MyClass myClassObject = new MyClass();
        InputStream inputStream1 = new FileInputStream("input.txt");
        OutputStream outputStream1 = new FileOutputStream("output.txt");

        // read all ints in stream and write them into our object
        while (inputStream1.available() > 0) {
            int data = inputStream1.read(); // read one int in stream
            myClassObject.write(data); // write one int into our object
        }

        // read all ints in our object and write into stream
        while (myClassObject.available() > 0) {
            int oneInt = myClassObject.read(); // read one int from input stream
            outputStream1.write(oneInt); // write one int into output stream
        }

        // close stream
        outputStream1.close();
    }
}

// same idea with own class
class MyClass {
    private List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44));

    public void write(int data) {
        list.add(data);
    }

    public int read() {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available() {
        return list.size();
    }
}
