// primitive problem from JavaRush
// make all variables correct in setValue method
public class CorrectTypes {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value) {
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
