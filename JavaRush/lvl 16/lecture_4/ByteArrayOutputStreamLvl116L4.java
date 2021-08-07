import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ByteArrayOutputStreamLvl116L4 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (PrintStream stream = new PrintStream(baos)) {
            stream.print("Hello");
            stream.println(" -> JAVA <- ");
        }
        String result = baos.toString();
        System.out.println(result);
    }
}
