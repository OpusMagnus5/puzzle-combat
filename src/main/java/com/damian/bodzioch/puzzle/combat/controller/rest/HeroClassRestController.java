package com.damian.bodzioch.puzzle.combat.controller.rest;

import com.damian.bodzioch.puzzle.combat.mapper.IHeroClassMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.HeroClassDTO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import com.damian.bodzioch.puzzle.combat.service.IHeroClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeroClassRestController {
    @Autowired
    IHeroClassService heroClassService;

    @Autowired
    IHeroClassMapper heroClassMapper;

    @RequestMapping(value = "/rest/hero/class/name/get/{pattern}", method = RequestMethod.GET)
    public List<String> getHeroClassNameByPattern(@PathVariable String pattern) {
        return heroClassService.getHeroClassByPattern(pattern).stream()
                .map(HeroClass::getName)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/rest/hero/class/get/{pattern}", method = RequestMethod.GET)
    public List<HeroClassDTO> getHeroClassByPattern(@PathVariable String pattern) {
        return heroClassService.getHeroClassByPattern(pattern).stream()
                .map(heroClassMapper::mapHeroClassToHeroClassDTO)
                .collect(Collectors.toList());
    }
}
