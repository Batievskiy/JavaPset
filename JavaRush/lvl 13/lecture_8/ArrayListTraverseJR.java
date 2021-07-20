// JavaRush lvl 13 lecture 8
// how to traverse and delete elements in arrayList?

import java.util.*;

public class ArrayListTraverseJR {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("thomas");
        Cat behemoth = new Cat("behemoth");
        Cat philip = new Cat("philip");
        Cat puchok = new Cat("pushok");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philip);
        cats.add(puchok);
        System.out.println("cats -> " + cats);

        // traverse and delete
//        for (Cat cat : cats) { // <--- bat way - throws exception
//            if (cat.name.equals("pushok")) {
//                cats.remove(cat);
//            }
//        }
        // best is to use Iterator
        Iterator<Cat> catIterator = cats.iterator(); // create iterator
        while (catIterator.hasNext()) {
            Cat nextCat = catIterator.next(); // getting next element
            System.out.println(nextCat);
        }
        // or enhanced for loop
        for (Cat nextCat : cats) {
            System.out.println(nextCat);
        }

        // at the end we will have:
        while(catIterator.hasNext()) {
            Cat nextCat = catIterator.next();
            if (nextCat.name.equals("philip")) {
                catIterator.remove();
            }
        }

        cats.removeIf(cat -> cat.name.equals("pushok")); // <--- simplest way

        System.out.println("cats -> " + cats);
    }
}

class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
    public String toString() {
        return ("Cat{name='" + name + '\'' + "}");
    }
}
