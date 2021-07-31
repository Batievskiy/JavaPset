// JavaRush lvl 13 lecture 3 problem
// create method paySalary(String)
// - if name exist in list waitingEmployees -> add name of employee to list alreadyGotSalaryEmployees
// - if string name == null -> nothing to do
// - in list waitingEmployees - change its name value to null

import java.util.ArrayList;

public class SolutionLvl13L3v1 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Gwenni");
        waitingEmployees.add("Cunninger");
        waitingEmployees.add("Borelli");
        waitingEmployees.add("Nimrod");
        waitingEmployees.add("Alibis");
        waitingEmployees.add("Ingrim");
        waitingEmployees.add("Phillie");

        System.out.println("waiting -> " + waitingEmployees);

        paySalary("Gwenni");
        System.out.println("already -> " + alreadyGotSalaryEmployees);
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);

            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i).equals(name)) {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}
