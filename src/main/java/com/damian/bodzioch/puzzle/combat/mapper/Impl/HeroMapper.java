package com.damian.bodzioch.puzzle.combat.mapper.Impl;

import com.damian.bodzioch.puzzle.combat.mapper.IHeroMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.HeroDTO;
import com.damian.bodzioch.puzzle.combat.model.Hero;
import org.springframework.stereotype.Component;

@Component
public class HeroMapper implements IHeroMapper {
    public Hero mapHeroDTOtoHero(HeroDTO heroDTO) {
        return Hero.builder()
                .id(heroDTO.getId())
                .name(heroDTO.getName())
                .power(heroDTO.getPower())
                .family(heroDTO.getFamily())
                .teamCost(heroDTO.getTeamCost())
                .specialSkill(heroDTO.getSpecialSkill())
                .chargeSpeed(heroDTO.getChargeSpeed())
                .heroClass(heroDTO.getHeroClass())
                .stars(heroDTO.getStars())
                .graknorkRating(heroDTO.getGraknorkRating())
                .color(heroDTO.getColor())
                .attack(heroDTO.getAttack())
                .defence(heroDTO.getDefence())
                .health(heroDTO.getHealth())
                .portal(heroDTO.getPortal())
                .build();
    }

    public HeroDTO mapHeroToHeroDTO(Hero hero) {
        return HeroDTO.builder()
                .id(hero.getId())
                .name(hero.getName())
                .power(hero.getPower())
                .family(hero.getFamily())
                .teamCost(hero.getTeamCost())
                .specialSkill(hero.getSpecialSkill())
                .chargeSpeed(hero.getChargeSpeed())
                .heroClass(hero.getHeroClass())
                .stars(hero.getStars())
                .graknorkRating(hero.getGraknorkRating())
                .color(hero.getColor())
                .attack(hero.getAttack())
                .defence(hero.getDefence())
                .health(hero.getHealth())
                .portal(hero.getPortal())
                .build();
    }
}
