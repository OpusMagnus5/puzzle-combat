package com.damian.bodzioch.puzzle.combat.mapper;

import com.damian.bodzioch.puzzle.combat.model.DTO.HeroClassDTO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;

public interface IHeroClassMapper {
    HeroClass mapHeroClassDTOtoHeroClass(HeroClassDTO heroClassDTO);
}
