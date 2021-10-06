// correct the program

// move implementation of the method initializeIdAndName in the class User
// - to return type User in the class User

public class SolutionLvl3L2v5 {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println();
    }

    static class Matrix {
        public static DBObject NEO = new User()
                .initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User()
                .initializeIdAndName(2, "Trinity");
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
