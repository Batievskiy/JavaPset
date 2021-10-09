// correct program.
// interface Desire must be implemented in class Hobby.
// interface Dream must be implemented in class Hobby.
// class Hobby must contain  static variable INDEX.
// method toString must increment and return INDEX.

public class SolutionLvl3L11v5 {
    public static void main(String[] args) {

    }

    interface Desire {

    }

    interface Dream /* implements Hobby */ {
        public static Hobby HOBBY = new Hobby();

    }

    static class Hobby /* extends */ implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
