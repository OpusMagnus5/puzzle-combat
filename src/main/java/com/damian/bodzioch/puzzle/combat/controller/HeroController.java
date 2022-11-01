package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.mapper.IHeroMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.HeroDTO;
import com.damian.bodzioch.puzzle.combat.model.EmblemPath;
import com.damian.bodzioch.puzzle.combat.model.Hero;
import com.damian.bodzioch.puzzle.combat.service.IHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeroController {
    private static final String HERO_PATH = "/hero";
    private static final String ADD_PATH = "/add";
    private static final String ADD_HERO_HTML = "add_hero.html";

    @Autowired
    IHeroService heroService;

    @Autowired
    IHeroMapper heroMapper;

    @RequestMapping(value = HERO_PATH + ADD_PATH, method = RequestMethod.GET)
    public String addNewHero(Model model) {
        model.addAttribute("hero", new HeroDTO())
                .addAttribute("emblemPath", EmblemPath.values());
        return ADD_HERO_HTML;
    }

    @RequestMapping(value = HERO_PATH + ADD_PATH, method = RequestMethod.POST)
    public String addNewHero(@ModelAttribute HeroDTO heroDTO) {
        heroService.createNewHero(heroMapper.mapHeroDTOtoHero(heroDTO));
        return "redirect:" + HERO_PATH + ADD_PATH;
    }
}
