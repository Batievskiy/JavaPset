public class AdditionJRLvl15L7 {
    public static void main(String[] args) {
        Dog dog = new Dog("Mylo");
        System.out.println("my new Dog is -> " + dog.name);
        dog.putCollar();
        dog.putLeash();
//        dog.putMuzzle(); // <--- uncomment this line ;)
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("checking isCollarPutOn ? -> " + dog.isCollarPutOn);
            System.out.println("checking isLeashPutOn ? -> " + dog.isLeashPutOn);
            System.out.println("checking isMuzzlePutOn ? -> " + dog.isMuzzlePutOn);
        }
    }
}

class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("the Collar is On");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("the Leash is On");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("the Muzzle is On");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Yeah! We are going to walk! " +
                    name + " is extremely happy :)");
        } else {
            throw new DogIsNotReadyException("Dog " + name + " is not Ready! Check the equipment!");
        }
    }
}

class DogIsNotReadyException extends Exception {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
