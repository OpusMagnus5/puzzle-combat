package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.mapper.IFamilyMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.FamilyDTO;
import com.damian.bodzioch.puzzle.combat.model.Family;
import com.damian.bodzioch.puzzle.combat.service.IFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FamilyController {
    @Autowired
    IFamilyMapper familyMapper;

    @Autowired
    IFamilyService familyService;

    @RequestMapping(value = "/family/add", method = RequestMethod.GET)
    public String addNewFamily(Model model){
        model.addAttribute("family", new FamilyDTO());
        return "add_family.html";
    }

    @RequestMapping(value = "/family/add", method = RequestMethod.POST)
    public String addNewFamily(@ModelAttribute FamilyDTO familyDTO){
        familyService.createFamily(familyMapper.mapFamilyDTOtoFamily(familyDTO));
        return "redirect:/family/add";
    }

    @RequestMapping(value = "/family/update", method = RequestMethod.GET)
    public String updateFamily(Model model){
        FamilyDTO emptyFamilyDTO = FamilyDTO.builder()
                        .name("")
                        .description("")
                        .build();
        model.addAttribute("family", emptyFamilyDTO);
        return "update_family.html";
    }

    @RequestMapping(value = "/family/update/{id}", method = RequestMethod.GET)
    public String getUpdateFamily(Model model, @PathVariable int id){
        FamilyDTO family = this.familyMapper.mapFamilyToFamilyDTO(this.familyService.getFamilyById(id));
        model.addAttribute("family", family);
        return "update_family.html";
    }

    @RequestMapping(value = "/family/update", method = RequestMethod.POST)
    public String updateFamily(@ModelAttribute FamilyDTO familyDTO){
        familyService.updateFamily(familyMapper.mapFamilyDTOtoFamily(familyDTO));
        return "redirect:/family/update/" + familyDTO.getId();
    }
}
