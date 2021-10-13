/*
 * 1. Implement the interface DBObject in class User.
 * 2. Create method initializeIdAndName to print "The user's name is Nem, id = 1"
 * 3. don't change methods toString and main.
 * 4. Figure out what to return in method initializeIdAndName.
 */

public class SolutionLvl3L11v4 {
    public static void main(String[] args) {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }
}
