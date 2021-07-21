// JavaRush lvl 12 lecture 6 problem
// correct the program to print out 100500
public class SolutionLvl12L6 {
    public static int salary;

    public static void add(int increase) {
        // int salary = SolutionLvl12L6.salary; // <--- this is must be deleter
        salary += increase;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
