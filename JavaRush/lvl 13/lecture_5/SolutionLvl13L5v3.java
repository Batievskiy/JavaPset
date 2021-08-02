// JavaRush lvl 13 lecture 5 problem
// create method removeGlassReverse()

import java.util.ArrayList;

public class SolutionLvl13L5v3 {

    private static ArrayList<String> initList() {
        String glassTop     = "       🍷       ";
        String glassSecond  = "      🍷🍷      ";
        String glassThird   = "     🍷🍷🍷     ";
        String glassFourth  = "    🍷🍷🍷🍷    ";
        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";

        ArrayList<String> list = new ArrayList<>();

        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("demolishing the pyramid -> ");
//        if (glasses.size() > 0) {
//            glasses.subList(0, glasses.size()).clear();
//        }
        for (int i = glasses.size() - 1; i >= 0; i--) {
            glasses.remove(i);
        }
        if (glasses.size() == 0) {
            System.out.println("pyramid is demolished!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);
        System.out.println("\n------\n");

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
