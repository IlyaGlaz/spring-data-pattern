package org.iliaglaz.springdatapattern.database.dao;


import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.iliaglaz.springdatapattern.database.entity.Lore;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LoreDao implements Dao<Long, Lore> {

    private final SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Lore entity) {
        currentSession().save(entity);
    }
}
