package ua.com.alevel.db.impl;

import ua.com.alevel.dynamicArray.DynamicArray;
import ua.com.alevel.entity.User;

import java.util.UUID;
// TODO - adapt db to new structure
public class AaDB {

    private final DynamicArray<User> users;
    private static AaDB instance;

    private AaDB() {
        System.out.println("AaDB");
        users = new DynamicArray<>();
    }

    public static AaDB getInstance() {
        if (instance == null) {
            instance = new AaDB();
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
