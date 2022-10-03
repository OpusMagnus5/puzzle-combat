package com.damian.bodzioch.puzzle.combat.mapper;

import com.damian.bodzioch.puzzle.combat.model.DTO.FamilyDTO;
import com.damian.bodzioch.puzzle.combat.model.Family;

public interface IFamilyMapper {
    Family mapFamilyDTOtoFamily(FamilyDTO familyDTO);
}
