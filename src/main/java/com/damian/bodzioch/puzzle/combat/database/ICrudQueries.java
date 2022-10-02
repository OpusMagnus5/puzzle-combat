package com.damian.bodzioch.puzzle.combat.database;

import com.damian.bodzioch.puzzle.combat.model.HibernateEntities;

public interface ICrudQueries {
    void persist(HibernateEntities object);
    void update(HibernateEntities object);
    void delete(HibernateEntities object);
}
