// delete all incorrect lines in Button interface

public class SolutionLvl3L11v0 {
    public static void main(String[] args) /* throws Exception */ {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {
        final String NAME = "Submit";

        // default methods of an interface are public!
        /* public void onPress(); */

        // modifier protected not allowed here!
        /* protected void onPress(); */

        void onPress();

        // private method in interface should have a body!
        /* private void onPress(); */

        // modifier protected not allowed here!
        /* protected String onPress(Object o); */

        String onPress(Object o);

        // private method in interface should have a body!
        /* private String onPress(Object o); */
    }
}
