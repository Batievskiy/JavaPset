/*
 * 1. Write a program:
 * - read cat names from console until Enter;
 * - for each cat -> create object class Cat
 * - and print out all cats;
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionLvl4L4v1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in))) {
            String key;
            while ((key = br.readLine()) != null) {
                Cat cat = CatFactory.getCatByKey(key);
                System.out.println(cat.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = new Cat(key);
            switch (key) {
                case "Tom" -> cat = new MaleCat("Tom");
                case "Tina" -> cat = new FemaleCat("Tina");
                case "Bill" -> cat = new MaleCat("Bill");
                default -> cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "I am Street Cat!";
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "I am Gentleman Cat " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "I am Lady Cat " + getName();
        }
    }
}
