public class InterfaceMultiple {

}

interface Moveable {

}

interface Eatable {

}

interface Eat {

}

class Cat {

}

class Mouse {

}

class Dog {

}

class Tom extends Cat implements Moveable, Eatable, Eat {

}

class Jerry extends Mouse implements Moveable, Eatable {

}

class Killer extends Dog implements Moveable, Eat {

}