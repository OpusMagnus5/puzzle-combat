package com.damian.bodzioch.puzzle.combat.model;

import javax.persistence.Entity;

@Entity(name = "thero")
public class Hero {
    private int id;
    private String name;
    private int power;
    private Family family;
    private int teamCost;
    private String specialSkill;
    private int chargeSpeed;
    private HeroClass aHeroClass;
    private int stars;
    private GraknorkRating graknorkRating;
    private String color;
}
