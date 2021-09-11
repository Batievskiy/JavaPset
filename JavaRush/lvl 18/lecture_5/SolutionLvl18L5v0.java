// in class MinMaxUtil
// - create public static methods:
// min() and max() - return minimal and maximal number
// with it's arguments type int
// with two to five arguments

public class SolutionLvl18L5v0 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = 33;
        int d = 44;
        int e = 55;

        System.out.println(MinMaxUtil.min(a, b, c, d, e));
        System.out.println(MinMaxUtil.max(a, b, c, d, e));
    }
}

class MinMaxUtil {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(
                Math.min(
                        Math.min(a, b), Math.min(c, d)
                ),
                e);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int max(int a, int b, int c, int d, int f) {
        return Math.max(
                Math.max(
                        Math.max(a, b), Math.max(c, d)
                ),
                f);
    }
}
