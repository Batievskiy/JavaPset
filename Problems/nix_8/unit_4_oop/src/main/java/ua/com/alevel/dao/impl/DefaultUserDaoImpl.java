package ua.com.alevel.dao.impl;

import ua.com.alevel.config.ObjectFactory;
import ua.com.alevel.dao.UserDao;
import ua.com.alevel.db.UserDB;
import ua.com.alevel.entity.User;

import java.util.Collection;

public class DefaultUserDaoImpl implements UserDao {

    private final UserDB db = ObjectFactory.getInstance().getCurrentObject(UserDB.class);

    @Override
    public void create(User entity) {
        db.create(entity);
    }

    @Override
    public void update(User entity) {
        db.update(entity);
    }

    @Override
    public void delete(String id) {
        db.delete(id);
    }

    @Override
    public User findById(String id) {
        return db.findById(id);
    }

    @Override
    public Collection<User> findAll() {
        return db.findAll();
    }

    @Override
    public boolean isExistByEmail(String email) {
        return db.isExistByEmail(email);
    }
}
