// JavaRush lvl 12 lecture 3 problem
// convert String to double, round it and print out
public class SolutionLvl12L3 {
    public static void main(String[] args) {
        String string = "12.84";
        double converted = Double.parseDouble(string);
        int rounded = (int) Math.round(converted);
        System.out.println(rounded);
    }
}
