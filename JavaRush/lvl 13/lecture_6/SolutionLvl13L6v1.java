// JavaRush lvl 13 lecture 6 problem
// change declaring of variables with a var everywhere you can

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolutionLvl13L6v1 {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
//        int integer = 22;
//        String string = "string";
//        int[] array = new int[5];
//        ArrayList<String> strings = new ArrayList<String>();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);

        var integer = 22;
        var string = "string";
        var array = new int[5];
        var strings = new ArrayList<String>();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }

}
