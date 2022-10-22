package com.damian.bodzioch.puzzle.combat.database;

import com.damian.bodzioch.puzzle.combat.model.HeroClass;

import java.util.List;

public interface IHeroClassDAO {
    void createHeroClass(HeroClass heroClass);
    HeroClass getHeroClassByName(String heroClassName);
    void updateHeroClas(HeroClass heroClass);
    List<HeroClass> getHeroClassByPattern(String pattern);
}
