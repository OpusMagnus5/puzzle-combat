package com.damian.bodzioch.puzzle.combat.service;

import com.damian.bodzioch.puzzle.combat.model.HeroClass;

import java.util.List;

public interface IHeroClassService {
    void createHeroClass(HeroClass heroClass);
    HeroClass getHeroClassByName(String classHeroName);
    void updateHeroClass(HeroClass heroClass);
    List<HeroClass> getHeroClassByPattern(String pattern);
}
