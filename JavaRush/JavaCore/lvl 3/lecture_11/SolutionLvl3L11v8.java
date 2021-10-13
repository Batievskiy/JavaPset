/*
 * 1. Interface Animal must be implemented in class Fox.
 * 2. In class Fox must be implemented only one method - getName();
 * 3. Don't change interface Animal.
 * 4. Don't create other classes or interfaces.
 */

import java.awt.Color;

public class SolutionLvl3L11v8 {
    public static void main(String[] args) {

    }

    public interface Animal {
        Color getColor();
        Integer getAge();
    }

    abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
