package ua.com.alevel.db.impl;

import ua.com.alevel.db.UserDB;
import ua.com.alevel.entity.User;
import ua.com.alevel.util.DBHelperUtil;

import java.util.HashSet;
import java.util.Set;

public class SomeUserDB implements UserDB {

    private final Set<User> users;
    private static SomeUserDB instance;

    private SomeUserDB() {
        System.out.println("SomeUserDB.SomeUserDB");
        users = new HashSet<>();
    }

    public static SomeUserDB getInstance() {
        if (instance == null) {
            instance = new SomeUserDB();
        }
        return instance;
    }

    public void create(User user) {
        user.setId(DBHelperUtil.generateId(users));
        users.add(user);
    }

    public void update(User user) {
        User current = findById(user.getId());
        current.setAge(user.getAge());
        current.setName(user.getName());
    }

    public void delete(String id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public User findById(String id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("user not found idiot!"));
    }

    public Set<User> findAll() {
        return users;
    }

    @Override
    public boolean isExistByEmail(String email) {
        return users.stream().anyMatch(user -> user.getEmail().equals(email));
    }
}