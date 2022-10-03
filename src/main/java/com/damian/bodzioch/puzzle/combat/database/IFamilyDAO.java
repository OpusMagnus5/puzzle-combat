package com.damian.bodzioch.puzzle.combat.database;

import com.damian.bodzioch.puzzle.combat.model.Family;

public interface IFamilyDAO {
    void createFamily(Family family);
    void updateFamily(Family family);
}
