package com.damian.bodzioch.puzzle.combat.service.Impl;

import com.damian.bodzioch.puzzle.combat.database.IHeroClassDAO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import com.damian.bodzioch.puzzle.combat.service.IHeroClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroClassService implements IHeroClassService {
    @Autowired
    IHeroClassDAO heroClassDAO;

    public void createHeroClass(HeroClass heroClass) {
        heroClassDAO.createHeroClass(heroClass);
    }
}
