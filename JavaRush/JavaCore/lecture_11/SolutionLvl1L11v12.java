// don't change class Pair and main
// create method getMinimumMaximumPair()
// - to return a Parir of max and min
// print out correct answer
// don't change inputArray


import java.util.Arrays;

public class SolutionLvl1L11v12 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);


    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        Integer max = Arrays.stream(inputArray).max().getAsInt();
        Integer min = Arrays.stream(inputArray).min().getAsInt();
        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
