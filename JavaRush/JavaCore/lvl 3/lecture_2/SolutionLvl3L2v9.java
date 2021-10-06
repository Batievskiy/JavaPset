// add an interface Secretary and Boss to class Manager and Subordinate.
// one for each

// inherit the interfaces Secretary and Boss
// from interface Person and HasManagementPotential
// in such way that all the methods of the class Manager and Subordinate
// be in some interface.


public class SolutionLvl3L2v9 {
    public static void main(String[] args) {

    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOtherToWork();
    }

    interface Secretary extends Person {

    }

    interface Boss extends Person, HasManagementPotential {

    }

    class Manager implements Boss {
        @Override
        public void startToWork() {

        }

        public void use(Person person) {
            person.startToWork();
        }

        public void statToWork() {

        }

        public boolean inspiresOtherToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {

        }

        public void startToWork() {

        }
    }
}
