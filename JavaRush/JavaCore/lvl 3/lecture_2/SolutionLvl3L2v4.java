// correct four mistakes in program.

public class SolutionLvl3L2v4 {
    public static void main(String[] args) {
        System.out.println(/* new Dream(). */ Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }

    interface Desire {

    }

    interface Dream {
        /* private */ static Hobby HOBBY = new Hobby();
    }

    // have to be static
    static class Hobby /* extends */ implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
