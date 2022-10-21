package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.mapper.IHeroClassMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.HeroClassDTO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import com.damian.bodzioch.puzzle.combat.model.TalentNode;
import com.damian.bodzioch.puzzle.combat.service.IHeroClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeroClassController {
    @Autowired
    IHeroClassService heroClassService;

    @Autowired
    IHeroClassMapper heroClassMapper;

    @RequestMapping(value = "/hero/class/add", method = RequestMethod.GET)
    public String addNewHeroClass(Model model){
        model.addAttribute("hero_class", new HeroClass());
        return "add_hero_class.html";
    }

    @RequestMapping(value = "/hero/class/add", method = RequestMethod.POST)
    public String addNewHeroClass(@ModelAttribute HeroClassDTO heroClassDTO) {
        heroClassService.createHeroClass((heroClassMapper.mapHeroClassDTOtoHeroClass(heroClassDTO)));
        return "redirect:/hero/class/add";
    }
}
