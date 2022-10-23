package com.damian.bodzioch.puzzle.combat.service.Impl;

import com.damian.bodzioch.puzzle.combat.database.IHeroDAO;
import com.damian.bodzioch.puzzle.combat.model.Hero;
import com.damian.bodzioch.puzzle.combat.service.IHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService implements IHeroService {
    @Autowired
    IHeroDAO heroDAO;

    public void createNewHero(Hero hero) {
        heroDAO.createHero(hero);
    }
}
