package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.model.DTO.FamilyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddNewModel {

    @RequestMapping(value = "/add/family", method = RequestMethod.GET)
    public String addNewFamily(Model model){
        model.addAttribute("family", new FamilyDTO());
        return "add-family.html";
    }
}
