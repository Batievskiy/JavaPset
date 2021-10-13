/*
 * 1. Interface Updatable must extend interface Selectable.
 * 2. Class Screen must implement interface Updatable.
 * 3. In class Screen must be implemented the method onSelect
 *    of the interface Selectable.
 * 4. In class Screen must be implementer the method refresh
 *    of the interface Updatable.
 */

public class SolutionLvl3L11v7 {
    public static void main(String[] args) {

    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    static class Screen implements Updatable {
        @Override
        public void refresh() {

        }
        @Override
        public void onSelect() {

        }
    }
}
