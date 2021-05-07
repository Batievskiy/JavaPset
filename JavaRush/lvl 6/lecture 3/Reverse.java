import java.util.Scanner;

// print out numbers from array in reverse order if size of array is even number
public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length: ");
        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("number" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\n");

        if (N % 2 == 0) {
            System.out.println("Reversed:");
            for (int i = N - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }
        else {
            System.out.println("Straight:");
            for (int i = 0; i < N; i++) {
                System.out.println(numbers[i]);
            }
        }
        sc.close();
    }
}