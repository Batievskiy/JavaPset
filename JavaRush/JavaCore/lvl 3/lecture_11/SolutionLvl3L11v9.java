/*
 * 1. Correct the classes to compile the program;
 * 2. Interface Animal must be implemented in class Fox;
 * 3. In class Fox must be implemented only one method - getName();
 * 4. In interface Animal must be declared method getColor();
 * 5. Class BigFox must be inherited from class Fox;
 * 6. Class Fox must be abstract.
 */

import java.awt.Color;

public class SolutionLvl3L11v9 {
    public static void main(String[] args) {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.RED;
        }
    }
}
