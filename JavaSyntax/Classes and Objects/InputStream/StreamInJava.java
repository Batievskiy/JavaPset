import java.io.FileInputStream;
import java.io.InputStream;

public class StreamInJava {
    public static void main(String[] args) {
        InputStream geek = null;

        try {
            geek = new FileInputStream("ABC.txt");

            // read() method : reading and printing Characters
            // one by one
            System.out.println("char -> " + (char) geek.read());
            System.out.println("char -> " + (char) geek.read());
            System.out.println("char -> " + (char) geek.read());

            // mark() : read liming the 'geek' input stream
            System.out.println(".skip() -> ");
            geek.mark(0);

            // skip() : it results in reading of 'e' in G'e'eeks
            System.out.println(".mark() -> ");
            geek.skip(1);

            System.out.println("char -> " + (char) geek.read());
            System.out.println("char -> " + (char) geek.read());
            System.out.println("char -> " + (char) geek.read());

            boolean check = geek.markSupported();
            if (geek.markSupported()) {
                // reset() method : repositioning the stream to
                // marked positions.
                System.out.println(".reset() invoked->");
                System.out.println("char -> " + (char) geek.read());
                System.out.println("char -> " + (char) geek.read());

            } else {
                System.out.println(".reset() not supported -> ");
            }
            System.out.println("geek.markSupported() -> supported" + " // .reset() -> " + check);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (geek != null) {
                try {
                    geek.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
