package ua.com.alevel.db;

import ua.com.alevel.dynamicArray.DynamicArray;
import ua.com.alevel.entity.User;

import java.util.UUID;

public class UserDB {

    private final DynamicArray<User> users;
    private static UserDB instance;

    private UserDB() {
        users = new DynamicArray<>();
    }

    public static UserDB getInstance() {
        if (instance == null) {
            instance = new UserDB();
        }
        return instance;
    }

    public void create(User user) {
        user.setId(generateId());
        users.add(user);
    }

    public void update(User user) {
        User currentUser = findById(user.getId());
        currentUser.setAge(user.getAge());
        currentUser.setName(user.getName());
    }

    public void delete(String id) {
        users.delete(id);
    }

    public User findById(String id) {
        return users.getId(id);
    }

    public DynamicArray<User> findAll() {
        return users;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        if (users.isContainsId(id)) {
            return generateId();
        }
        return id;
    }
}
