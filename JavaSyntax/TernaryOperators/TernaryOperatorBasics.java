import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
// what is Ternary Operator?
// let's find out
public class TernaryOperatorBasics {
    private static final Scanner sc = new Scanner(System.in);
    private static final Set<String> answers = new HashSet<>(Arrays.asList("hello", "hey", "hi", "sup", "sup?"));
    public static void main(String[] args) {
        /*
        Ternary Operator - function like a simplified Java if statement.
        - consists of a condition that evaluates to either true or false
        + a value that is returned it the condition is true and another value if false
         */

        // let's try some simple example
        String hello = getHello();
        String answer = isHello(hello) ? "Nice to meet you :)" : "foo :(";
        System.out.println(answer + "\n");

        // or another example
        int iQ = getIQ();
        String result = getIntelligence(iQ);
        answer = (iQ >= 85) ? "Nice :)" : "Don't be mad :)";
        System.out.println(result + "\n" + answer + "\n");

        // or another
        int number = getInt();
        answer = (number > 0) ? " is a positive number :)" : " is a negative number :(";
        System.out.println(number + answer + "\n");

        // nested ternary operators
        int n1 = getInt(), n2 = getInt(), n3 = getInt();
        // to find the largest number
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest number is: " + largest);
    }

    private static String getHello() {
        String answer = "";
        while (answer.isEmpty()) {
            System.out.println("Hello:)");
            answer = sc.nextLine();
        }
        return answer;
    }

    private static boolean isHello(String answer) {
        return answers.contains(answer.toLowerCase());
    }

    private static int getIQ() {
        String iq;
        do {
            System.out.print("Enter your IQ: ");
            iq = sc.nextLine().trim();
            if (!iq.matches("(-?)\\d+")) {
                System.err.println("(" + iq + ") is not a NUMBER!\nTry Again...");
                iq = "";
            }
        } while (iq.isEmpty());
        return Integer.parseInt(iq);
    }

    private static String getIntelligence(int iq) {
        String intelligence;
        if (iq < 70) {
            intelligence = "Intellectually disabled :(";
        } else if (iq < 85) {
            intelligence = "Below average :/";
        } else if (iq < 115) {
            intelligence = "Average :)";
        } else if (iq < 130) {
            intelligence = "Above average :O";
        } else {
            intelligence = "Exceptional!!!";
        }
        return intelligence;
    }

    private static int getInt(){
        String number;
        do {
            System.out.print("Enter a Number: ");
            number = sc.nextLine().trim();
            if (!number.matches("(-?)\\d+")) {
                System.err.println("(" + number + ") is not a NUMBER!\nTry Again...");
                number = "";
            }
        } while (number.isEmpty());
        return Integer.parseInt(number);
    }
}
