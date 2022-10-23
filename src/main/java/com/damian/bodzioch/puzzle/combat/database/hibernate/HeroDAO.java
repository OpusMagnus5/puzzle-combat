package com.damian.bodzioch.puzzle.combat.database.hibernate;

import com.damian.bodzioch.puzzle.combat.database.ICrudQueries;
import com.damian.bodzioch.puzzle.combat.database.IHeroDAO;
import com.damian.bodzioch.puzzle.combat.model.Hero;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HeroDAO implements IHeroDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    ICrudQueries crudQueries;

    public void createHero(Hero hero){
        crudQueries.persist(hero);
    }
}
