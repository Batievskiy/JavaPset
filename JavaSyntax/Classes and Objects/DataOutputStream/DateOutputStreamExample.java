import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DateOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("C:/test.txt");
        DataOutputStream dateOutputStream = new DataOutputStream(fileOutputStream);

        dateOutputStream.writeUTF("Hello, Java world");
        dateOutputStream.writeInt(69);
        dateOutputStream.writeDouble(3.15);
        dateOutputStream.writeBoolean(true);

        System.out.println(fileOutputStream);
    }
}
