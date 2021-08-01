import java.util.Arrays;

public class StackTraceExceptionLvl15L6 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            StackTraceElement[] methods = e.getStackTrace();
            for (StackTraceElement info : methods) {
                System.out.println(info);
            }

            // or:
            e.printStackTrace();
        }
    }
}
