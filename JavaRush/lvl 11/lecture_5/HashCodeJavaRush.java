// lvl 11 lecture 5
// .hashCode() method in Java
public class HashCodeJavaRush {
}

class User {
    private long id;
    private String name;
    private String email;

    // getters and setters
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    private String getEmali() {
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }

    private long getId() {
        return id;
    }
    private void setId(long id) {
        this.id = id;
    }
    // Constructor
    User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

	// if we decided to override .equals() method
	// we have to write our own hashCode logics
    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    // or -> Eclipse produces this:
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((email == null) ? 0 : email.hashCode());
//        result = prime * result + (int) (id ^ (id >>> 32));
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // if obj equals to this object
        if (obj == null) return false; // if obj is not exists
        if (this.getClass() != obj.getClass()) return false; // if obj Class does not equals to Class User

        User user = (User) obj;
        return id == user.id
                && (name.equals(user.name))
                && email.equals(user.email);
    }
}
