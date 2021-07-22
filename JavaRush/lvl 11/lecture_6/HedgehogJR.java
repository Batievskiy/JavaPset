public class HedgehogJR {

    public void eat(Apple apple) {
        System.out.println("Apple has been eaten");
    }

    public static void main(String[] args) {
        HedgehogJR hedgehogJR = new HedgehogJR();
        Apple apple = new Apple();
        hedgehogJR.eat(apple);
    }

    public static class Apple {

    }
}