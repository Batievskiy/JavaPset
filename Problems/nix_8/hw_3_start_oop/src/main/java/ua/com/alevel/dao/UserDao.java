package ua.com.alevel.dao;

import ua.com.alevel.dynamicArray.DynamicArray;
import ua.com.alevel.db.UserDB;
import ua.com.alevel.entity.User;

public class UserDao {

    public void create(User user) {
        UserDB.getInstance().create(user);
    }

    public void update(User user) {
        UserDB.getInstance().update(user);
    }

    public void delete(String id) {
        UserDB.getInstance().delete(id);
    }

    public User findById(String id) {
        return UserDB.getInstance().findById(id);
    }

    public DynamicArray<User> findAll() {
        return UserDB.getInstance().findAll();
    }
}
