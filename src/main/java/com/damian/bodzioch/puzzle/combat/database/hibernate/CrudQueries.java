package com.damian.bodzioch.puzzle.combat.database.hibernate;

import com.damian.bodzioch.puzzle.combat.database.ICrudQueries;
import com.damian.bodzioch.puzzle.combat.model.HibernateEntities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class CrudQueries implements ICrudQueries {
    @Autowired
    SessionFactory sessionFactory;

    public void persist(HibernateEntities object){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }

    public void update(HibernateEntities object){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }

    public void delete(HibernateEntities object){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }
}
