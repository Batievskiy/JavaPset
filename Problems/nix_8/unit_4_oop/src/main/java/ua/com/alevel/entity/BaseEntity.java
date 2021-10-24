package ua.com.alevel.entity;

// BaseEntity class cannot be instantiated !
// like AUDI
public abstract class BaseEntity {
    // any entity have its own id for internal processes
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
