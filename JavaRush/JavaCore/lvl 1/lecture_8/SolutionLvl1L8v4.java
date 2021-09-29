// check all the variables and add those that miss.

public class SolutionLvl1L8v4 {
    public static void main(String[] args) {

    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        private String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        private int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }

        private int getWeight() {
            return weight;
        }

        private void setWeight(int weight) {
            this.weight = weight;
        }

        private int getSpeed() {
            return speed;
        }

        private void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}
