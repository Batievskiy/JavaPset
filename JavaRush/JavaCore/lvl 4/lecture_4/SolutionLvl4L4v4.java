/*
 * 1. Change program:
 * - to call method play() if person is type Player
 * - to call method dance() if person is type Dancer
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionLvl4L4v4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = bufferedReader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        if (person instanceof Player player) {
            player.play();
        } else if (person instanceof Dancer dancer) {
            dancer.dance();
        }
    }

    interface Person {

    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
