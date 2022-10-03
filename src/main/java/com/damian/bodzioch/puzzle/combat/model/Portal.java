package com.damian.bodzioch.puzzle.combat.model;

public enum Portal {
    HOTM("HotM"),
    EPIC("Epic"),
    MERCENARY("Mercenary"),
    GRAND_HEIST("Grand Heist"),
    RAIDERS_OF_THE_WASTELAND("Raiders of the Wasteland"),
    HIGH_NOON("High Noon"),
    HALLOWEEN("Halloween"),
    CHRISTMAS("Christmas"),
    EASTER("Easter"),
    SUMMER("Summer"),
    MECHANOID("Mechanoid"),
    ZOMBIE_OUTBREAK("Zombie"),
    NEON_CITY("Neon City (Season 2)"),
    MONSTER_ISLAND("Monster Island"),
    ROCK_BAND("Rock Band");

    private String name;

    Portal(String name) {
        this.name = name;
    }
}
