import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class PrintStreamLvl16L4 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        // printStream Object
        PrintStream printStream = new PrintStream(fileOutputStream);
        String s = "first";

        // writing to file
        char[] c = {'h', 'e', 'l', 'l', 'o'};

        printStream.print(true);

        printStream.print(1);

        printStream.print(4.533f);

        printStream.print("String!");
        printStream.println();

        printStream.print(fileOutputStream);
        printStream.println();

        printStream.println(printStream.checkError());

        printStream.format(Locale.UK, "Welcome to my %s program", s);

        printStream.flush();

        printStream.close();
    }
}
