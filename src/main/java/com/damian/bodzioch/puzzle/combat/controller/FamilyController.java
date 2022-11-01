package com.damian.bodzioch.puzzle.combat.controller;

import com.damian.bodzioch.puzzle.combat.mapper.IFamilyMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.FamilyDTO;
import com.damian.bodzioch.puzzle.combat.service.IFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FamilyController {
    private final String FAMILY_PATH = "/family";
    private final String ADD_PATH = "/add";
    private final String UPDATE_PATH = "/update";
    private final String UPDATE_FAMILY_HTML = "update_family.html";
    private final String ADD_FAMILY_HTML = "add_family.html";

    @Autowired
    IFamilyMapper familyMapper;

    @Autowired
    IFamilyService familyService;

    @RequestMapping(value = FAMILY_PATH + ADD_PATH, method = RequestMethod.GET)
    public String addNewFamily(Model model){
        model.addAttribute("family", new FamilyDTO());
        return ADD_FAMILY_HTML;
    }

    @RequestMapping(value = FAMILY_PATH + ADD_PATH, method = RequestMethod.POST)
    public String addNewFamily(@ModelAttribute FamilyDTO familyDTO){
        familyService.createFamily(familyMapper.mapFamilyDTOtoFamily(familyDTO));
        return "redirect:" + FAMILY_PATH + ADD_PATH;
    }

    @RequestMapping(value = FAMILY_PATH + UPDATE_PATH, method = RequestMethod.GET)
    public String getUpdateFamily(Model model, @RequestParam(required = false) String familyName){
        FamilyDTO family;
        if (familyName != null){
            family = this.familyMapper.mapFamilyToFamilyDTO(this.familyService.getFamilyByName(familyName));
        } else {
            family = FamilyDTO.builder()
                    .name("")
                    .description("")
                    .build();
        }
        model.addAttribute("family", family);
        return UPDATE_FAMILY_HTML;
    }

    @RequestMapping(value = FAMILY_PATH + UPDATE_PATH, method = RequestMethod.POST)
    public String updateFamily(@ModelAttribute FamilyDTO familyDTO){
        familyService.updateFamily(familyMapper.mapFamilyDTOtoFamily(familyDTO));
        return "redirect:" + FAMILY_PATH + UPDATE_PATH + "?familyName=" + familyDTO.getName();
    }
}
