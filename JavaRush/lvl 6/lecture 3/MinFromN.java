import java.util.Scanner;

public class MinFromN {
    public static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size N: ");
        int N = sc.nextInt();

        array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int min = array[0];

        for (int i = 0; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("Min number is: " + min + "\n");
    }
}
