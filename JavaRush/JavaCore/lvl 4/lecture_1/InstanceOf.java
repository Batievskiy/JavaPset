public class InstanceOf {
    /*
     * The instanceof operator in java is used to check weather an object
     * is an instance of a particular class or not.
     */
    public static void main(String[] args) {

        String name = "stringName";
        // check if name is instance of String
        boolean isNameInstanceOfString = name instanceof String;
        System.out.printf("is %s instance of String? -> %s\n",
                name, isNameInstanceOfString);

        // instanceOf during inheritance
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        // check if childClass is instance of ParentClass
        boolean isChildInstanceOfParent = childClass instanceof ParentClass;
        System.out.printf("is %s instance of %s? -> %s\n",
                childClass.getClass(), parentClass.getClass(), isChildInstanceOfParent);

        // instanceof in Interface
        Dog dog = new Dog();
        //check if dog is instance of Animal
        boolean isDogInstanceOfAnimal = dog instanceof Animal;
        System.out.printf("is %s instance of %s? -> %s\n",
                dog.getClass(), Animal.class, isDogInstanceOfAnimal);

    }
}

class ParentClass {

}

class ChildClass extends ParentClass {

}

interface Animal {

}

class Dog implements Animal {

}