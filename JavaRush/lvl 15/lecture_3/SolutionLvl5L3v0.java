// figure out what program do
// print out variable answer in catch block
// and throw an SecurityException further

import java.util.Scanner;

public class SolutionLvl5L3v0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        buyElephant(null, sc);
    }

    static void buyElephant(String answer, Scanner sc) {
        if (answer == null) {
            System.out.println("Buy an elephant");
        } else if (answer.equalsIgnoreCase("ok")) {
            System.out.println("That is way better! List of your excuses");
            throw new SecurityException();
        } else {
            System.out.println("Everybody says that \"" +
                    answer + "\", did you buy an elephant?");
        }

        answer = sc.nextLine();

        try {
            buyElephant(answer, sc);
        } catch (Exception e) {
            // TODO
            System.out.println(answer);
            throw e;
        }
    }
}
