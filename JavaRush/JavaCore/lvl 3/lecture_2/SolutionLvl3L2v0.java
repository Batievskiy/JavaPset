// figure out which of the interface
// had to implemented in class BeerLover

// add this interface into BeerLover and all its methods
// figure out how to connect READY_TO_GO_HOME
// and method isReadyToGoHome

// return value of the variable READY_TO_GO_HOME
// in method isReadyToGoHome

public class SolutionLvl3L2v0 {
    public static void main(String[] args) {

    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        public void askForMore(String message) {

        }

        public void sayThankYou() {

        }

        public void sleepOnTheFloor() {

        }

        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
    }
}
