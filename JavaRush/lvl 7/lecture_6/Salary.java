// piece of weird code from JavaRush
// using this.values
public class Salary {
    public String name = "Amigo";
    public String position = "Java Developer";
    public int salary = 10_000;

    public static void main(String[] args) {
        // nonstatic values and methods can't be used in static main function!
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
