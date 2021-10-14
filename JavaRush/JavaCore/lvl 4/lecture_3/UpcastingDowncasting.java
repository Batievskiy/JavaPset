public class UpcastingDowncasting {
    /*

      [     Parent     ]
         ^          |
         |          |
    Upcasting VS Downcasting
         |          |
         |          v
      [     Child     ]

     */
    public static void main(String[] args) {
        // upcast child to Parent
        Parent parent = (Parent) new Child();
        parent.printName();

        // downcast parent to Child
        Child child = (Child) parent;
        child.printName();

        Object object = new TigerZ();

        // downcast object to AnimalZ
        AnimalZ animalZ = (AnimalZ) object;

        // downcast object to CatZ
        CatZ catZ = (CatZ) object;

        // downcast animalZ to Tiger
        TigerZ tigerZ = (TigerZ) animalZ;

        // downcast catZ to TigerZ
        TigerZ tigerZ2 = (TigerZ) catZ;
    }
}

class Parent {
    void printName() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void printName() {
        System.out.println("Child");
    }
}

class AnimalZ {

}

class CatZ extends AnimalZ {

}

class TigerZ extends CatZ {

}
