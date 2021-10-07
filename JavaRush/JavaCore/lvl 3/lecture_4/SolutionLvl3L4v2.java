// implement an interface Animal in class Fox
// change code to make class Fox to have only one method getName()
// be sure to not change other classes and don't delete anything.

import java.awt.*;

public class SolutionLvl3L4v2 {
    public static void main(String[] args) throws Exception {

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
