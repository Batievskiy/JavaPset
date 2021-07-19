// JavaRush lvl 13 lecture 8
import java.util.ArrayList;
import java.util.Arrays;

public class Cat {
    private String name;

    public Cat(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Thomas");
        Cat behemoth = new Cat("Behemoth");
        Cat philip = new Cat("Philip");
        Cat pushok = new Cat("Puchok");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philip);
        cats.add(pushok);

        System.out.println("cats -> " + cats);
        System.out.println();

        int thomasIndex = cats.indexOf(thomas);
        System.out.println("cats.indexOf(thomas) -> " + thomasIndex);
        System.out.println();

        Cat secondCat = cats.get(1);
        System.out.println("cats.get(1) -> " + secondCat);
        System.out.println();

        boolean isPhilipContains = cats.contains(philip);
        System.out.println("contains(philip) ? -> " + isPhilipContains);
        System.out.println();

        Cat newCat = new Cat("NEW CAT");
        cats.set(0, newCat);
        System.out.println("cats.set(0, new Cat(\"NEW CAT\")) -> " + newCat);
        System.out.println();

        cats.clear();
        System.out.println("cats.clear() -> " + cats);
        System.out.println();

        Cat[] catsArray = {thomas, behemoth, philip, pushok};
        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println("Cat[] catsArray = {thomas, behemoth, philip, pushok};");
        System.out.println("ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));");
        System.out.println("---> " + catsList);
        System.out.println();

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philip);
        cats.add(pushok);

        catsArray = cats.toArray(new Cat[0]);
        System.out.println("catsArray = cats.toArray(new Cat[0]);");
        System.out.println("catsArray -> " + Arrays.toString(catsArray));
        System.out.println();

        int catsSize = cats.size();
        System.out.println("cats.size() -> " + catsSize);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
