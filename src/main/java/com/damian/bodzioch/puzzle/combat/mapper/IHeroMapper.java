package com.damian.bodzioch.puzzle.combat.mapper;

import com.damian.bodzioch.puzzle.combat.model.DTO.HeroDTO;
import com.damian.bodzioch.puzzle.combat.model.Hero;

public interface IHeroMapper {
    Hero mapHeroDTOtoHero(HeroDTO heroDTO);
    HeroDTO mapHeroToHeroDTO(Hero hero);
}
