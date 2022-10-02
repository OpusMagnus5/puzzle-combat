package com.damian.bodzioch.puzzle.combat.model;

public enum Color {
    YELLOW("YELLOW"),
    PURPLE("PURPLE"),
    GREEN("GREEN"),
    RED("RED"),
    BLUE("BLUE");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
