// JavaRush lvl 12 lecture 4 problem
// create inner class Engine
// in Engine class create boolean isRunning
// add start and stop methods
public class CarJRLvl12L4 {
    private Engine engine;

    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }
        public void stop() {
            isRunning = false;
        }
    }
}
