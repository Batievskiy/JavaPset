public class Overloading {
    public static void main(String[] args) {

    }

    // we can overload main() method:
    public static void main() {

    }

    public static void main(String string) {

    }
}

class Sum {

    static int sum(int a, int b) {
        return a + b;
    }

    // overloading by changing no. of arguments:
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // overloading by changing type of arguments:
    static long sum(long a, long b) {
        return a + b;
    }

    // overloading by changing no. of arguments:
    static long sum(long a, long b, long c) {
        return a + b + c;
    }

    // overloading with TypePromotion
    static long sum(int a, long b) {
        return a + b; // here is a promoted to long type
    }

    static long sum(int a, int b, long c) {
        return a + b + c; // here is a and b are promoted to long
    }

    // we CAN'T overload method by changing return type of method:
//     static double sum(int a, int b) {
//        return a + b;
//    }
}