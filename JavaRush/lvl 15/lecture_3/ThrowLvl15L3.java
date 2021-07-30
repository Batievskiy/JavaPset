public class ThrowLvl15L3 {
    public static void main(String[] args) {
        System.out.println("main starts :O");
        try {
            fun();
        } catch(IllegalAccessException e) {
            System.out.println("caught in main :D");
        }
    }

    static void fun() throws IllegalAccessException {
        System.out.println("fun() starts ;)");
        try {
            throw new IllegalAccessException("demo");
        } catch(IllegalAccessException e) {
            System.out.println("caught inside fun()");
            System.out.println("fun() ends :(");
            throw e; // rethrow the exception
        }
    }
}
