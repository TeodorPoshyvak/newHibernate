package org.example.entityDAO;


import java.util.List;

public interface Dao<T> {
    boolean createEntity(T entity);

    boolean updateEntity(T entity);

    void deleteEntity(T entity);

    List<T> getAllEntity();
}
