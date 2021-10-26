/*
 * 1. Create interface Bridge;
 * - create method getCarsCount().
 * 2. Create class WaterBridge and SuspensionBridge that implements Bridge
 *
 * - getCarsCount() must return any fixed ints;
 * 2. In class Solution create public println(Bridge bridge).
 * 3. In method print() - print out getCarsCount() value for object bridge.
 */

public class SolutionLvl4L8v0 {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}
