/*
 * 1. Read lines from console until something else except:
 * - user, looser, coder, proger;
 *
 * 2. For each line:
 * - create new Object corresponding the line;
 * - pass this object to goWork()
 *
 * 3. Implement the method doWork():
 * - call live() - for User;
 * - call doNothing() - for Looser;
 * - call writeCode() - for Coder;
 * - call enjoy() - for Proger;
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionLvl4L8v2 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            Person person = null;
            String key = null;

            try {
                while (true) {
                    key = bufferedReader.readLine();
                    boolean isOk = key.equals("user") || key.equals("looser") ||
                            key.equals("coder") || key.equals("proger");
                    if (!isOk) break;
                    switch (key) {
                        case "user" -> person = new Person.User();
                        case "looser" -> person = new Person.Looser();
                        case "coder" -> person = new Person.Coder();
                        case "proger" -> person = new Person.Proger();
                    }
                    doWork(person);
                }
            } catch (IOException e) {
                System.out.println("error -> " + e);
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Looser) {
            ((Person.Looser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
