import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

// let's find out how to deal with FIBONACCI numbers
public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("fibbo to N: ");
        int number = sc.nextInt();

        int resultForLoop = fiboForLoop(number);
        System.out.println("for loop: " + resultForLoop);

        int resultRecursion = fiboRecursive(number);
        System.out.println("recursive: " + resultRecursion);

        Map<Integer, Integer> lookup = new HashMap<>();
        int resultLookup = fiboLookup(number, lookup);
        System.out.println("lookup: " + resultLookup);
    }

    // let's use for loop here
    // time complexity n - 1 times: O(n)
    public static int fiboForLoop(int n) {

        // check if nothing to count
        if (n <= 1) {
            return n;
        }

        int previous = 0, current = 1;
        for (int i = 0; i < n - 1; i++) {
            int next = previous + current; // we have to calculate next value
            // and shift old values to the left for next loop calculation
            previous = current;
            current = next;
        }
        return current;
    }

    // let's make it in recursive way
    public static int fiboRecursive(int n) {
        // same check if nothing to count
        if (n <= 1) {
            return n;
        }
        // and here is the trick with recursion
        // we gonna call function using formula:
        // fibo numbers f(n) = f(n - 1) + f(n - 2)
        return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }

    // but we can improve time complexity on calculations
    // saving values that already been calculated to Maps
    public static int fiboLookup(int n, Map<Integer, Integer> lookup) {
        // still have to check if nothing to calculate
        if (n <= 1) {
            return n;
        }
        // if subsequence of calculation is first time
        // putIfAbsent tends to add a value to the Map
        // if this value at particular key does not exist in Map
        lookup.putIfAbsent(n, fiboLookup(n - 1, lookup) + fiboLookup(n - 2, lookup));

        return lookup.get(n);
    }
}