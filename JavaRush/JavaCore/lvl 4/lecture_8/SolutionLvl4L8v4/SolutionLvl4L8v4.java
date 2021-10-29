/*
 * 1. Create interface CompItem
 * - add method String getName();
 * 2. Create class Keyboard, Mouse, Monitor that implements CompItem.
 * - getName() - must return computer's part name.
 * 3. Create class Computer
 * - add private field keyboard type Keyboard;
 * - add private field mouse type Mouse;
 * - add private field monitor type Monitor;
 * - create constructor with all variables;
 * - add getters and setters.
 */

public class SolutionLvl4L8v4 {

    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
        isWork(computer.getMonitor()) &&
        isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem compItem) {
        System.out.println(compItem.getName());
        return compItem.getName() != null && compItem.getName().length() > 4;
    }
}
