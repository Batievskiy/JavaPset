package ua.com.alevel.entity;

// class User have id field from BaseEntity,
// but it's hidden under the hood.
public class User extends BaseEntity {

    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User -> " +
                "id = [ " + super.getId() + " ]" +
                ", name = [ " + name + " ]" +
                ", age = [ " + age + " ]" +
                ", email = [ " + email + " ]" +
                "\n";
    }
}
