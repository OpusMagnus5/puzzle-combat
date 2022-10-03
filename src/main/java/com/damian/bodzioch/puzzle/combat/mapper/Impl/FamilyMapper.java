package com.damian.bodzioch.puzzle.combat.mapper.Impl;

import com.damian.bodzioch.puzzle.combat.mapper.IFamilyMapper;
import com.damian.bodzioch.puzzle.combat.model.DTO.FamilyDTO;
import com.damian.bodzioch.puzzle.combat.model.Family;
import org.springframework.stereotype.Component;

@Component
public class FamilyMapper implements IFamilyMapper {
    public Family mapFamilyDTOtoFamily(FamilyDTO familyDTO){
        return Family.builder()
                .id(familyDTO.getId())
                .name(familyDTO.getName())
                .description(familyDTO.getDescription())
                .build();
    }
}
