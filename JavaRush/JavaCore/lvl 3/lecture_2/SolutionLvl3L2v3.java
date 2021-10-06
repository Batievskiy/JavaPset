// create class Screen and implement an interfaces Selectable and Updatable
// don't forget to create all the methods.

public class SolutionLvl3L2v3 {
    public static void main(String[] args) {

    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
