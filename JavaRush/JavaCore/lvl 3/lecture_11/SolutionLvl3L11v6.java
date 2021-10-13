/*
 * 1. Class StringObject must implement interface SimpleObject.
 * 2. Interface SimpleObject in class StringObject
 *    must be implemented with a parameter String.
 * 3. In class StringObject implement method getInstance()
 *    of the interface SimpleObject.
 * 4. Class StringObject must exist in class Solution.
 * 5. Class StringObject must be static.
 */

public class SolutionLvl3L11v6 {

    public static void main(String[] args) {
        StringObject stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
