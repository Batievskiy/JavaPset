package ua.com.syntax.entity;

public abstract class Hen extends BaseEntity {

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "\n---< I am Chicken !";
    }

}
