package com.damian.bodzioch.puzzle.combat.database.hibernate;

import com.damian.bodzioch.puzzle.combat.database.ICrudQueries;
import com.damian.bodzioch.puzzle.combat.database.IFamilyDAO;
import com.damian.bodzioch.puzzle.combat.model.Family;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FamilyDAO implements IFamilyDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    ICrudQueries crudQueries;

    public void createFamily(Family family){
        crudQueries.persist(family);
    }

    public void updateFamily(Family family) {
        crudQueries.update(family);
    }

    public List<Family> getAllFamilies() {
        Session session = this.sessionFactory.openSession();
        Query<Family> query = session.createQuery("FROM com.damian.bodzioch.puzzle.combat.model.Family");
        List<Family> result = query.getResultList();
        session.close();
        return result;
    }

    public List<Family> getFamiliesByPattern(String pattern) {
        Session session = this.sessionFactory.openSession();
        Query<Family> query = session.createQuery("FROM com.damian.bodzioch.puzzle.combat.model.Family WHERE name like :pattern");
        query.setParameter("pattern", "%" + pattern + "%")
                .setMaxResults(5);
        List<Family> result = query.getResultList();
        session.close();
        return result;
    }

    public Family getFamilyById(int id){
        Session session = sessionFactory.openSession();
        Query<Family> query = session.createQuery("FROM com.damian.bodzioch.puzzle.combat.model.Family WHERE id = :id");
        query.setParameter("id", id);
        Family result = query.getSingleResult();
        session.close();
        return result;
    }
}
