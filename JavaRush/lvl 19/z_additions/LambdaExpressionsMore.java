import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaExpressionsMore {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        System.out.print("print out all numbers: ");
        evaluate(list, n -> true); // test all elements of the array are numbers

        System.out.print("don't print numbers at all: ");
        evaluate(list, n -> false); // test all elements of the array are NOT numbers

        System.out.print("print out even numbers: ");
        evaluate(list, n -> n % 2 == 0); // test all elements of the array are EVEN numbers

        System.out.print("print out odd numbers:");
        evaluate(list, n -> n % 1 == 0); // test all elements of the array are ODD numbers

        System.out.print("print out numbers greater than 5");
        evaluate(list, n -> n > 5);

        // square of each element:
        // old way:
        for (Integer n : list) {
            int x = n * n;
            System.out.println(x);
        }
        // lambda expression:
        list.stream().map((x) -> x * x).forEach(System.out::println);

        // sum of all squares of all elements:
        // old way:
        int sum = 0;
        for(Integer n : list) {
            int x = n * n;
            sum = sum + x;
        }
        System.out.println(sum);

        // lambda expression:
        int sum2 = list.stream()
                // converting Stream of numbers into Stream of squares of the numbers
                .map(x -> x * x)
                // calculating the sum of all elements
                .reduce((x, y) -> x + y)
                // getting the value of calculations
                .get();
        System.out.println(sum2);


    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        // the functional interface Predicate - improves manageability of code,
        // helps in unit-testing them separately.
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n +" ");
            }
        }
        System.out.println();
    }
}
