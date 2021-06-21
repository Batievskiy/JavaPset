// How to set flags in Bitwise operations?
// let's find out
public class BitwiseFlags {
    public static void main(String[] args) {
        System.out.println("---< Flags in Bitwise operations Java >---\n");
        
        int N = 67;

        // 1. Set Flag using Bitwise "|" (OR) and "<<" (left shift)
        // (number | (1 << Flag Position)
        System.out.println("1. Set Flag using Bitwise \"|\" (OR) and \"<<\" (left shift) ->");
        System.out.println("(number | (1 << Flag Position)");
        System.out.println("N in decimal -> " + N);
        System.out.println("N in binary -> " + Integer.toBinaryString(N));
        System.out.println();
        N = setFlag(N, 3);

        System.out.println("Number 10 flag set to 3rd -> " + N);
        System.out.println("N in binary -> " + Integer.toBinaryString(N));
        System.out.println("                  ^");
        System.out.println("is flag set to 3rd? -> " + checkFlag(N, 3));
        System.out.println();

        // 2. Reset Flag using Bitwise "&" (AND), ~ (NOT) and "<<" (left shift)
        // (number | (1 << Flag Position)
        System.out.println("2. Reset Flag using Bitwise \"&\" (AND), ~ (NOT) and \"<<\" (left shift) ->");
        System.out.println("(number & ~(1 << Flag Position)");
        N = resetFlag(N, 3);
        System.out.println("Number 10 flag reset from 3rd -> " + N);
        System.out.println("N in binary -> " + Integer.toBinaryString(N));
        System.out.println("                  ^");
        System.out.println("is flag set to 3rd? -> " + checkFlag(N, 3));

    }

    // Set Flag using Bitwise "|" (OR) and "<<" (left shift)
    private static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    // Reset Flag using Bitwise "&" (AND), ~ (NOT) and "<<" (left shift)
    private static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    // Check is Flag set to a particular position
    private static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}