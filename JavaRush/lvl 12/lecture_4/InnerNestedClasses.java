// What is inner and nested classes in Java?
// let's find out

import java.util.ArrayList;

public class InnerNestedClasses {
    static ArrayList<Point> points = new ArrayList<Point>();

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 100;
        point.y = 200;
        points.add(point);

        // to access to inner Nested class:
        // ParentClass.NestedClass name = new ParentClass.NestedClass();
        Point.Nested innerNested = new Point.Nested();
        innerNested.name = "innerNested"; // access by a reference
        Point.Nested.name = "newNestedName"; // access by a Parent Class

        // to access to inner Nested method:
        // ParentClass.NestedClass.nestedMethod();
        Point.Nested.setName("Nested");
        System.out.println(Point.Nested.getName());

        // to access to a static variable:
        // ParentClass.NestedClass.nestedVariableName
        Point.Nested.name = "newStaticNestedName";

        // All Nested Static Classes are behave as regular Classes
        // - without any access restrictions
        Java java = new Java(); // nested static class
        Outer outer = new Outer(); // regular class
    }

    // Nested class
    static class Java {
        String hello;
        String name;
    }

    // static NESTED class
    static class Point {
        int x;
        int y;

        // inner static NESTED class
        static class Nested {
            public static String name;

            static String getName() {
                return name;
            }

            static void setName(String name) {
                Nested.name = name;
            }
        }
    }
}

class Outer {
    int x;
    int y;
}
