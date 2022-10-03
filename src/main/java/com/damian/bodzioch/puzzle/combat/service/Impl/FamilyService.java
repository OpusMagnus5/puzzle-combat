package com.damian.bodzioch.puzzle.combat.service.Impl;

import com.damian.bodzioch.puzzle.combat.database.IFamilyDAO;
import com.damian.bodzioch.puzzle.combat.model.Family;
import com.damian.bodzioch.puzzle.combat.service.IFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService implements IFamilyService {
    @Autowired
    IFamilyDAO familyDAO;

    public void createFamily(Family family){
        familyDAO.createFamily(family);
    }

    public void updateFamily(Family family){
        familyDAO.updateFamily(family);
    }
}
