/*
 * 1. Implement method printMainInfo:
 * - if object type Drawable passed - call method draw;
 * - if object type Movable passed - call method move
 */

public class SolutionLvl4L8v3 {

    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        if (object instanceof Drawable) {
            Drawable drawable = (Drawable) object;
            drawable.draw();
        } else if (object instanceof Movable) {
            Movable movable = (Movable) object;
            movable.move();
        }
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn!");
        }
        public void move() {
            System.out.println("Can be moved!");
        }
    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {

        public void draw() {
            System.out.println("Can be drawn!");
        }

        public void move() {
            System.out.println("Can be moved!");
        }
    }
}
