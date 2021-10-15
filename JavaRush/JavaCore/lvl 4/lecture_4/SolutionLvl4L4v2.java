/*
 * 1. Create program to help you what to eat:
 * - implement an interface Selectable in class Food;
 * - method onSelect() must print "The food was selected";
 * - in method callFoodMethods must call objects type Food;
 * - in method callSelectableMethods must call methods available
 *   from any object implemented interface Selectable.
 */

public class SolutionLvl4L4v2 {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten.");
        }
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
