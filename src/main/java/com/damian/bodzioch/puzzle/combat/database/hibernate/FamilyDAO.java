package com.damian.bodzioch.puzzle.combat.database.hibernate;

import com.damian.bodzioch.puzzle.combat.database.ICrudQueries;
import com.damian.bodzioch.puzzle.combat.database.IFamilyDAO;
import com.damian.bodzioch.puzzle.combat.model.Family;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
