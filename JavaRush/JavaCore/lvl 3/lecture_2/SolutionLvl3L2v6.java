// implement the interface SimpleObject with parameter String in class StringObject

public class SolutionLvl3L2v6 {
    public static void main(String[] args) {

    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
