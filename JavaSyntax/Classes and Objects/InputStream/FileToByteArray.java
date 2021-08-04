import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

// Main class
public class FileToByteArray {

    public static void main(String[] args) throws IOException {

        File path = new File("input.txt");

        byte[] array = convertFileToArray(path);

        System.out.print(Arrays.toString(array));
    }

    // convert file to byte array
    public static byte[] convertFileToArray(File file)
            throws IOException {

        FileInputStream stream = new FileInputStream(file);

        byte[] array = new byte[(int) file.length()];

        stream.read(array);

        stream.close();

        return array;
    }
}