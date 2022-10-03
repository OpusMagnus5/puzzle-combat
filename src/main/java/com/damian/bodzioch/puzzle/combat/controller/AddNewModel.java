package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.mapper.IFamilyMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.FamilyDTO;
import com.damian.bodzioch.puzzle.combat.service.IFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddNewModel {
    @Autowired
    IFamilyMapper familyMapper;

    @Autowired
    IFamilyService familyService;

    @RequestMapping(value = "/family", method = RequestMethod.GET)
    public String addNewFamily(Model model){
        model.addAttribute("family", new FamilyDTO());
        return "add_family.html";
    }

    @RequestMapping(value = "/family", method = RequestMethod.POST)
    public String addNewFamily(@ModelAttribute FamilyDTO familyDTO){
        familyService.createFamily(familyMapper.mapFamilyDTOtoFamily(familyDTO));
        return "redirect:/family";
    }
}
