import java.io.FileOutputStream;

public class TryWithResourcesV0 {

    // the Try-with-resources statement
    // is a try statement that declares
    // one or more resources in it.
    // A resource is an object that must be closed
    // once your program is done using it.

    public static void main(String[] args) {

        // try block to check for exceptions
        try (
                // creating an object of FileOutputStream
                // to write stream or daw data

                // Adding resource
                FileOutputStream fos = new FileOutputStream("test.txt")
        ) {
            // custom string input
            String text = "Hello, java world";

            // converting string to bytes
            byte[] arr = text.getBytes();

            // text written in the file
            fos.write(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // displaying message for successful execution of the program
        System.out.println("resources are closed and message has been written into the test.txt");
    }

}
