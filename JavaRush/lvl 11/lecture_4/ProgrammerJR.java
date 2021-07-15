/* JavaRush lvl 11 lecture 4 problem
   class ProgrammerJR must contain:
  - non-static private int salary
  - public getter for salary
  - public setter for salary
*/
public class ProgrammerJR {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
