// simple problem from JavRush
// implement getPowerOfTwo that get number 2 in power of N
// using Bitwise operators
public class BitwisePowerOfTwo {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(getPowerOfTwo(N));
    }

    private static int getPowerOfTwo(int power) {
        int result = 2;
        result = result << power - 1;
        return result;
    }
}
