package ua.com.alevel.db;

import ua.com.alevel.entity.BaseEntity;

import java.util.Collection;

// Data Base must work with any collection type
// so... Generify interface - to parameterize it we use
public interface BaseDB<ENTITY extends BaseEntity> {

    void create(ENTITY entity);
    void update(ENTITY entity);
    void delete(String id);
    ENTITY findById(String id);
    Collection<ENTITY> findAll(); // must work with any collection
}
