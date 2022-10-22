package com.damian.bodzioch.puzzle.combat.controller.rest;

import com.damian.bodzioch.puzzle.combat.model.Family;
import com.damian.bodzioch.puzzle.combat.service.IFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FamilyRestController {
    @Autowired
    IFamilyService familyService;

    @RequestMapping(value = "/rest/family/get/{pattern}", method = RequestMethod.GET)
    public List<String> getFamiliesByPattern(@PathVariable String pattern) {
        return familyService.getFamiliesByPattern(pattern).stream()
                .map(Family::getName)
                .collect(Collectors.toList());
    }
}
