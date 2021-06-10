// problem from JavaRush
// change all methods using Math. from Java
public class SqCbPow {
    public static void main(String[] args) {
        double n = 16;
        double a = 27;
        System.out.println("square root from " + n + " is: " + sqrt(n));
        System.out.println("cube root from " + a + " is: " + cbrt(a));
        System.out.println(2 + " in power 2 is: " + pow((int)(2), 2));

        System.out.println("square root from " + n + " is: " + Math.sqrt(n));
        System.out.println("cube root from " + a + " is: " + Math.cbrt(a));
        System.out.println(2 + " in power 2 is: " + Math.pow(2, 2));
    }

    // return square root of n
    static double sqrt(double n) {
        double tmp;
        double sqrt = n / 2;
        do {
            tmp = sqrt;
            sqrt = (tmp + (n / tmp)) / 2;
        } while ((tmp - sqrt) != 0);
        return sqrt;
    }

    // return the absolute value of n - mid * mid * mid
    static double diff(double n, double mid) {
        if (n > (mid * mid * mid)) {
            return (n - (mid * mid * mid));
        } else {
            return ((mid * mid * mid) - n);
        }
    }

    // return cube root of n
    static double cbrt(double n) {
        // set start and end for binary search
        double start = 0, end = n;

        // set precision
        double precision = 0.0000001;

        while (true) {
            double mid = (start + end) / 2;
            double error = diff(n, mid);

            // if error is less than precision then mid is our answer so return mid
            if (error <= precision) {
                return mid;
            }
            // if (mid * mid * mid) is greater than s, set end = mid
            if ((mid * mid * mid) > n) {
                end = mid;
            }
            // if (mid * mid * mid) is less than n, set start = mid
            else {
                start = mid;
            }
        }
    }
    // return power of n
    static double pow(int n, int p) {
        int result = n;
        if (p == 0) {
            return 1;
        }
        for (int i = 1; i < p; i++) {
            result *= n;
        }
        return p < 0 ? 1d / result : result;
    }
}
