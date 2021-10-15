/*
 * 1. Create program that creates Mouse:
 * - class GrayMouse must be inherited from class Mouse;
 * - class Jerry must be inherited from class GrayMouse;
 * - in variable obj must be stored an object that instance of Mouse, GrayMouse and Jerry;
 * - method main must call method printClasses();
*/

public class SolutionLvl4L4v3 {
    public static void main(String[] args) {
        Object obj = new Jerry();

        Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);
    }

    public static void printClasses(Object o, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(o.getClass().getSimpleName());
    }

    static class Mouse {

    }
    static class GrayMouse extends Mouse {

    }

    static class Jerry extends GrayMouse {

    }
}
