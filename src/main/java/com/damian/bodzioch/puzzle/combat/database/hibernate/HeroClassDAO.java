package com.damian.bodzioch.puzzle.combat.database.hibernate;

import com.damian.bodzioch.puzzle.combat.database.ICrudQueries;
import com.damian.bodzioch.puzzle.combat.database.IHeroClassDAO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HeroClassDAO implements IHeroClassDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    ICrudQueries crudQueries;

    public void createHeroClass(HeroClass heroClass) {
        crudQueries.persist(heroClass);
    }
}
