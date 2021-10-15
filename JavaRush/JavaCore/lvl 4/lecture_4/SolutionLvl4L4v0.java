/*
 * 1. Correct the program:
 * - class School must be inherited from class Building;
 * - method getSchool() must return new School;
 * - method getBuilding() must return new Building;
 * - class School must be static;
 * - class Building must be static.
 * DON'T change methods signatures getSchool and getBuilding
 */

public class SolutionLvl4L4v0 {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getBuilding() {
        return new Building();
    }

    public static Building getSchool() {
        return new School();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
