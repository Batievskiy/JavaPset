// primitive problem from JavaRush
// inherit classes and methods
// JavaDeveloper from Human and Human from Entity
public class EntityHumanJavaDeveloper {
    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        jd.imSuper();
        jd.justDoIt();
        jd.iCanCode();
    }
}

// Super Class
class Entity {
    public Entity() {
        System.out.println("I am Entity");
    }

    public void imSuper() {
        System.out.println("I am Super :)");
    }
}

// first sub class
class Human extends Entity {
    public Human() {
        System.out.println("I am Human");
    }

    public void justDoIt() {
        System.out.println("Just Do It :D");
    }
}

// second sub class
class JavaDeveloper extends Human {
    public JavaDeveloper() {
        System.out.println("I am JavaDeveloper");
    }

    public void iCanCode() {
        System.out.println("I can code :0");
    }
}