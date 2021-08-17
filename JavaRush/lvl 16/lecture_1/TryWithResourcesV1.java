import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TryWithResourcesV1 {
    // the Try-with-resources statement
    // is a try statement that declares
    // one or more resources in it.
    // A resource is an object that must be closed
    // once your program is done using it.
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("output.txt");
             // reading a stream of character from
             BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
            String text;

            while ((text = bufferedReader.readLine()) != null) {
                byte[] arr = text.getBytes();
                fos.write(arr);
            }
            System.out.println("file content copied to another one");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("resources are closed and message has been written into test.txt");
    }
}
