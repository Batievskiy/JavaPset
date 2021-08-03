// JavaRush lvl 13 lecture 6 problem
// change code using double curly braces

import java.util.ArrayList;

public class SolutionLvl13L6v3 {
    public static void main(String[] args) {

//        var strings = new ArrayList<String>();
//        strings.add("Так");
//        strings.add("тоже");
//        strings.add("можно");
//        strings.add("делать");
//        strings.add("!");

        var strings = new ArrayList<String>() {{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    }
}
