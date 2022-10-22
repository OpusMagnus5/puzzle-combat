package com.damian.bodzioch.puzzle.combat.database.hibernate;

import com.damian.bodzioch.puzzle.combat.database.ICrudQueries;
import com.damian.bodzioch.puzzle.combat.database.IHeroClassDAO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HeroClassDAO implements IHeroClassDAO {

    private static final String CLASS_PATH = "com.damian.bodzioch.puzzle.combat.model.HeroClass";

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    ICrudQueries crudQueries;

    public void createHeroClass(HeroClass heroClass) {
        crudQueries.persist(heroClass);
    }

    public HeroClass getHeroClassByName(String heroClassName){
        Session session = sessionFactory.openSession();
        Query<HeroClass> query = session.createQuery("FROM " + CLASS_PATH + " WHERE name = :heroClassName");
        query.setParameter("heroClassName", heroClassName);
        HeroClass result = query.getSingleResult();
        session.close();
        return result;
    }

    public void updateHeroClas(HeroClass heroClass){
        crudQueries.update(heroClass);
    }

    public List<HeroClass> getHeroClassByPattern(String pattern) {
        Session session = sessionFactory.openSession();
        Query<HeroClass> query = session.createQuery("FROM " + CLASS_PATH + " WHERE name like :pattern");
        query.setParameter("pattern", "%" + pattern + "%")
                .setMaxResults(5);
        List<HeroClass> result = query.getResultList();
        session.close();
        return result;
    }

}
