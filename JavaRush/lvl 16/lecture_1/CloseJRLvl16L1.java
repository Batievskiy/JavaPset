import java.io.FileOutputStream;
import java.io.IOException;

public class CloseJRLvl16L1 {
    public static void main(String[] args) {
        String path = "c:\\projects\\log.txt";

//        FileOutputStream output = null;
//        try {
//            output = new FileOutputStream(path);
//            output.write(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (output != null) {
//                output.close(); // <--- Unhandled exception
//            }
//        }

        try (FileOutputStream output = new FileOutputStream(path)) {
            output.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
