// primitive problem from JavaRush
// use primitive variables with each other
public class MoreCorrectTypes {
    long a = 109 + 15;
    int b = (int) a * 2;
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}
