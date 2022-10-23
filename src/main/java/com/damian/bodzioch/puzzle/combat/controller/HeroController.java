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
    @Autowired
    IHeroService heroService;

    @Autowired
    IHeroMapper heroMapper;

    @RequestMapping(value = "/hero/add", method = RequestMethod.GET)
    public String addNewHero(Model model) {
        model.addAttribute("hero", new HeroDTO())
                .addAttribute("emblemPath", EmblemPath.values());
        return "add_hero.html";
    }

    @RequestMapping(value = "/hero/add", method = RequestMethod.POST)
    public String addNewHero(@ModelAttribute HeroDTO heroDTO) {
        heroService.createNewHero(heroMapper.mapHeroDTOtoHero(heroDTO));
        return "redirect:/hero/add";
    }
}
