import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceStream {
    public static void main(String[] args) {

        Selector.initData();

        List<String> findNames = new ArrayList<>();
        List<Cat> findCats = new ArrayList<>();
        for (Owner owner : Selector.owners) {
            for (Animal pet : owner.getPets()) {
                if (Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) {
                    findCats.add((Cat) pet);
                }
            }
        }

        Collections.sort(findCats, new Comparator<Cat>() {
            public int compare(Cat o1, Cat o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        for (Cat cat : findCats) {
            findNames.add(cat.getName());
        }

        findNames.forEach(System.out::println);

        // alternative variant using stream
        final List<String> findNames2 = Selector.owners.stream()
                // transition from Stream<Owner> to Stream<Pet>
                .flatMap(owner -> owner.getPets().stream())
                // leaving only Cats it the data stream
                .filter(pet -> Cat.class.equals(pet.getClass()))
                // leaving only FOXY colored cats in the data stream
                .filter(cat -> Color.FOXY == cat.getColor())
                // sorting the list by age in descending order
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                // grabbing names
                .map(Animal::getName)
                // putting the result into List
                .collect(Collectors.toList());

        findNames2.forEach(System.out::println);
    }

}

enum Color {
    WHITE,
    BLACK,
    DARK_GREY,
    LIGHT_GREY,
    FOXY,
    GREEN,
    YELLOW,
    BLUE,
    MAGENTA
}

abstract class Animal {
    private String name;
    private Color color;
    private int age;

    public Animal(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}

class Cat extends Animal {
    public Cat(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Dog extends Animal {
    public Dog(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Parrot extends Animal {
    public Parrot(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Pig extends Animal {
    public Pig(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Snake extends Animal {
    public Snake(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Owner {
    private String name;
    private List<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public List<Animal> getPets() {
        return pets;
    }
}

class Selector {
    public static List<Owner> owners;

    public static void initData() {
        final Owner owner1 = new Owner("John Doe");
        owner1.getPets().addAll(List.of(
                new Cat("Baron", Color.BLACK, 3),
                new Cat("Sultan", Color.DARK_GREY, 4),
                new Cat("Elza", Color.WHITE, 0)
        ));

        final Owner owner2 = new Owner("Dal Moore");
        owner2.getPets().addAll(List.of(
                new Cat("Foxie", Color.FOXY, 7),
                new Cat("Barsik", Color.GREEN, 5),
                new Cat("Admiral", Color.BLUE, 3)
        ));

        final Owner owner3 = new Owner("Natalie May");
        owner3.getPets().addAll(List.of(
                new Dog("Arnold", Color.YELLOW, 3),
                new Pig("Piggy", Color.LIGHT_GREY, 8)
        ));

        final Owner owner4 = new Owner("Pavel Miles");
        owner4.getPets().addAll(List.of(
                new Cat("Fisher", Color.BLACK, 16),
                new Cat("zORRO", Color.FOXY, 14),
                new Cat("Margo", Color.WHITE, 3),
                new Cat("Zambies", Color.DARK_GREY, 1)
        ));

        final Owner owner5 = new Owner("Antonio Gavara");
        owner5.getPets().addAll(List.of(
                new Snake("Udavus", Color.MAGENTA, 1)
        ));

        owners = List.of(owner1, owner2, owner3, owner4, owner5);
    }
}