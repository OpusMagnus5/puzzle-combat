package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.mapper.IHeroClassMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.HeroClassDTO;
import com.damian.bodzioch.puzzle.combat.model.HeroClass;
import com.damian.bodzioch.puzzle.combat.service.IHeroClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeroClassController {
    private final String HERO_CLASS_PATH = "/hero/class";
    private final String ADD_PATH = "/add";
    private final String UPDATE_PATH = "/update";
    private final String UPDATE_HERO_CLASS_HTML = "update_hero_class.html";
    private final String ADD_HERO_CLASS_HTML = "add_hero_class.html";

    @Autowired
    IHeroClassService heroClassService;

    @Autowired
    IHeroClassMapper heroClassMapper;

    @RequestMapping(value = HERO_CLASS_PATH + ADD_PATH, method = RequestMethod.GET)
    public String addNewHeroClass(Model model){
        model.addAttribute("hero_class", new HeroClass());
        return ADD_HERO_CLASS_HTML;
    }

    @RequestMapping(value = HERO_CLASS_PATH + ADD_PATH, method = RequestMethod.POST)
    public String addNewHeroClass(@ModelAttribute HeroClassDTO heroClassDTO) {
        heroClassService.createHeroClass((heroClassMapper.mapHeroClassDTOtoHeroClass(heroClassDTO)));
        return "redirect:" + HERO_CLASS_PATH + ADD_PATH;
    }

    @RequestMapping(value = HERO_CLASS_PATH + UPDATE_PATH, method = RequestMethod.GET)
    public String getUpdateFamily(Model model, @RequestParam(required = false) String heroClassName){
        HeroClassDTO heroClass;
        if (heroClassName != null){
            heroClass = this.heroClassMapper.mapHeroClassToHeroClassDTO(this.heroClassService.getHeroClassByName(heroClassName));
        } else {
            heroClass = HeroClassDTO.builder()
                    .name("")
                    .build();
        }
        model.addAttribute("hero_class", heroClass);
        return UPDATE_HERO_CLASS_HTML;
    }

    @RequestMapping(value = HERO_CLASS_PATH + UPDATE_PATH, method = RequestMethod.POST)
    public String updateHeroClass(@ModelAttribute HeroClassDTO heroClassDTO){
        heroClassService.updateHeroClass(heroClassMapper.mapHeroClassDTOtoHeroClass(heroClassDTO));
        return "redirect:" + HERO_CLASS_PATH + UPDATE_PATH + "?heroClassName=" + heroClassDTO.getName();
    }
}
