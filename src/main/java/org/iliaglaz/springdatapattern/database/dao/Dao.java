package org.iliaglaz.springdatapattern.database.dao;

public interface Dao<V, T> {

    void save(T entity);
}
