package com.damian.bodzioch.puzzle.combat.model;

public enum EmblemPath {
    ATTACK("Attack > Defense > Health"),
    DEFENSE("Defense > Health > Attack"),
    HEALTH("Health > Defense > Attack");

    private final String description;

    EmblemPath(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
