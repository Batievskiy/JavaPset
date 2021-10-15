import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TryCatchFinally {

    private static final int SIZE = 10;
    private static List<Integer> list;

    public static void main(String[] args) {
        list = fillList();
        System.out.println(list);
        try {
            writeList();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> fillList() {
        List<Integer> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i * 11);
        }
        return list;
    }

    public static void writeList() throws Throwable {
        PrintWriter out = null;
        Throwable mainThrowable = null;

        try {
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("out.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (Throwable t) {
            mainThrowable = t;
            throw t;
        } finally {
            if (mainThrowable == null) {
                System.out.println("closing PrintWriter");

                // manually close resource
                out.close();
            } else {
                try {
                    out.close(); // NullPointerException need to be handled
                } catch (Throwable unused) {
                    // ignoring this exception,
                    // or creating log of exceptions.
                }
                System.out.println("PrintWriter not closed");
            }
        }
    }
}
