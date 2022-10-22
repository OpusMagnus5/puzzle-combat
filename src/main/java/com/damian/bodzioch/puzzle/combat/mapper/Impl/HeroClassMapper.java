package com.damian.bodzioch.puzzle.combat.mapper.Impl;

import com.damian.bodzioch.puzzle.combat.mapper.IHeroClassMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.HeroClassDTO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import org.springframework.stereotype.Component;

@Component
public class HeroClassMapper implements IHeroClassMapper {
    public HeroClass mapHeroClassDTOtoHeroClass(HeroClassDTO heroClassDTO) {
        return HeroClass.builder()
                .id(heroClassDTO.getId())
                .name(heroClassDTO.getName())
                .build();
    }

    public HeroClassDTO mapHeroClassToHeroClassDTO (HeroClass heroClass) {
        return HeroClassDTO.builder()
                .id(heroClass.getId())
                .name(heroClass.getName())
                .build();
    }
}
