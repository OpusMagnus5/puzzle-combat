package com.damian.bodzioch.puzzle.combat.database;

import com.damian.bodzioch.puzzle.combat.model.Family;

import java.util.List;

public interface IFamilyDAO {
    void createFamily(Family family);
    void updateFamily(Family family);
    List<Family> getAllFamilies();
    List<Family> getFamiliesByPattern(String pattern);
    Family getFamilyById(int id);
}
