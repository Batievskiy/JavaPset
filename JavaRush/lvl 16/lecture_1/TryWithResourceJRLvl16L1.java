import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceJRLvl16L1 {
    public static void main(String[] args) {
        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        //
//        try {
//            input = new FileInputStream(src);
//            output = new FileOutputStream(dest);
//            byte[] buffer = input.readAllBytes();
//            output.write(buffer);
//
//        } catch (IOException e) {
//            System.out.println("IOException!");
//        } finally {
//            if (input != null) {
//                input.close(); // <--- IOException here
//            }
//            if (output != null) {
//                output.close(); // <--- IOException here
//            }
//        }

        // best practice:
        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
